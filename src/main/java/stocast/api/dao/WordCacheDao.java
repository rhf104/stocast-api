package stocast.api.dao;

import stocast.api.model.domain.WordCacheEntity;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static stocast.api.service.ObjectifyService.ofy;

public class WordCacheDao extends ObjectifyDao<WordCacheEntity> {

    private static final int MAX_BLOCK_SIZE_BYTES = 1000000;

    public Optional<WordCacheEntity> loadById(Class<WordCacheEntity> clazz, Long id) {
        return super.loadById(clazz, id);
    }

    public List<WordCacheEntity> loadAll() {
        return ofy().load().type(WordCacheEntity.class).list();
    }

//    @Override
//    public Long save(final WordCacheEntity wordCacheEntity) {
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//        objectOutputStream.writeObject(wordCacheEntity);
//        objectOutputStream.flush();
//        objectOutputStream.close();
//
//        final byte[] byteArray = byteArrayOutputStream.toByteArray();
//        int numBlocks = (int)Math.ceil(byteArray.length / (double) MAX_BLOCK_SIZE_BYTES);
//        List<byte[]> byteBlocks = new ArrayList<>();
//        for (int i = 0; i < numBlocks; i++) {
//            byte[] bytes = new byte[MAX_BLOCK_SIZE_BYTES];
//            System.arraycopy(byteArray, i*MAX_BLOCK_SIZE_BYTES, bytes, 0, );
//            byteBlocks.add(bytes);
//        }
//        return ofy().save().entity(wordCacheEntity).now().getId();
//    }
}
