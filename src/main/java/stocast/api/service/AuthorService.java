package stocast.api.service;

import stocast.api.dao.AuthorDao;
import stocast.api.model.Author;
import stocast.api.model.domain.AuthorEntity;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorService {

    private final AuthorDao authorDao;

    @Inject
    public AuthorService(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public void saveAuthor(Author author) {
        authorDao.save(AuthorEntity.from(author));
    }

    public List<Author> getAuthors() {
        return authorDao.loadAll().stream()
                .map(Author::new)
                .collect(Collectors.toList());
    }
}
