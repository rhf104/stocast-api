package stocast.api.service;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.util.Closeable;
import stocast.api.model.domain.AuthorEntity;
import stocast.api.model.domain.StatusEntity;
import stocast.api.model.domain.WordCacheEntity;

public class ObjectifyService {
    static {
        com.googlecode.objectify.ObjectifyService.register(StatusEntity.class);
        com.googlecode.objectify.ObjectifyService.register(AuthorEntity.class);
        com.googlecode.objectify.ObjectifyService.register(WordCacheEntity.class);
    }

    public static Objectify ofy() {
        return com.googlecode.objectify.ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return com.googlecode.objectify.ObjectifyService.factory();
    }

    public static Closeable begin() {
        return com.googlecode.objectify.ObjectifyService.begin();
    }

}