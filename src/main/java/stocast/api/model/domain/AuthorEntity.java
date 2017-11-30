package stocast.api.model.domain;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Ignore;
import com.googlecode.objectify.annotation.Load;
import com.googlecode.objectify.annotation.OnLoad;
import stocast.api.model.Author;

import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class AuthorEntity extends AbstractEntity {

    private String name;
    private String years;

    @Ignore
    private Set<WordCacheEntity> cachedTitles;

    @Load
    private Set<Ref<WordCacheEntity>> cachedTitlesRef;

    public static AuthorEntity from(Author author) {
        final AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setName(author.name);
        authorEntity.setYears(author.years);
        return authorEntity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public Set<WordCacheEntity> getCachedTitles() {
        return cachedTitles;
    }

    public void setCachedTitles(Set<WordCacheEntity> cachedTitles) {
        this.cachedTitles = cachedTitles;
        this.cachedTitlesRef = cachedTitles.stream()
                .map(Ref::create)
                .collect(Collectors.toSet());
    }

    @OnLoad
    void deref() {
        if (cachedTitlesRef != null) {
            cachedTitles = cachedTitlesRef.stream()
                    .map(Ref::get)
                    .collect(Collectors.toSet());
        }
    }
}
