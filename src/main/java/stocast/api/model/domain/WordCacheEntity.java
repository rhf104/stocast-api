package stocast.api.model.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Serialize;
import stocast.api.model.WordCache;

@Entity
public class WordCacheEntity extends AbstractEntity {

    @Serialize
    private WordCache wordCache;

    public WordCacheEntity() {

    }

    public WordCache getWordCache() {
        return wordCache;
    }

    public void setWordCache(WordCache wordCache) {
        this.wordCache = wordCache;
    }
}
