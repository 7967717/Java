package com.rr.notes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author roman.rudenko on 15-Apr-16.
 */
public interface NotesRepository extends MongoRepository<You, String> {

    You findByLogin(String login);
    List<You> findByLoginLike(String loginLike);
    List<You> findByNotesTitleLike(String noteNameLike);

}
