package stocast.api.dao;

import stocast.api.model.domain.AuthorEntity;
import stocast.api.model.domain.WordCacheEntity;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static stocast.api.service.ObjectifyService.ofy;

public class AuthorDao extends ObjectifyDao<AuthorEntity> {

    public Optional<AuthorEntity> loadById(Class<AuthorEntity> clazz, Long id) {
        return super.loadById(clazz, id);
    }

    public List<AuthorEntity> loadAll() {
        return ofy().load().type(AuthorEntity.class).list();
    }

    public void addWordCache(Long id, WordCacheEntity wordCacheEntity) {
        AuthorEntity authorEntity = loadById(AuthorEntity.class, id).get();
        Set<WordCacheEntity> titles = authorEntity.getCachedTitles();
        if (titles == null) {
            titles = new HashSet<>();
        }
        titles.add(wordCacheEntity);
        authorEntity.setCachedTitles(titles);
        save(authorEntity);
    }
}
