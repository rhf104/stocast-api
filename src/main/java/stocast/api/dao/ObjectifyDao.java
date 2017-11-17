package stocast.api.dao;

import java.util.Optional;

import static stocast.api.service.ObjectifyService.ofy;

public abstract class ObjectifyDao<T> {

    public void save(final T object) {
        ofy().save().entity(object).now();
    }

    public void delete(final T object) {
        ofy().delete().entity(object).now();
    }

    public Optional<T> loadById(final Class<T> clazz, final Long id) {
        return Optional.ofNullable(ofy().load().type(clazz).id(id).now());
    }
}