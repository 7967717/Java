package com.rr.notes;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;


/**
 * @author roman.rudenko on 15-Apr-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppConfig.class)
public class AppTest {
    private static final Logger LOG = LoggerFactory.getLogger(AppTest.class);

    @Autowired
    private NotesRepository notesRepository;

    @Before
    public void setUp() {
        You aaa = new You("aaa");
        aaa.addNote(new Note("a1", new ContentText("a111")));
        aaa.addNote(new Note("a2", new ContentText("a222")));
        aaa.addNote(new Note("a3", new ContentText("a333")));

        You bbb = new You("bbc");
        bbb.addNote(new Note("b1", new ContentText("b111")));
        bbb.addNote(new Note("b2", new ContentText("b222")));
        bbb.addNote(new Note("b3", new ContentText("b333")));

        You ccc = new You("ccc");
        ccc.addNote(new Note("c1", new ContentText("c111")));
        ccc.addNote(new Note("c2", new ContentText("c222")));


        notesRepository.save(Arrays.asList(aaa, bbb, ccc));
    }

    @Test
    public void testCount() {
        LOG.info("^^^^^^^^^^^^^^^^^ Number of Users ^^^^^^^^^^^^^^^^^");
        LOG.info("Users count - " + notesRepository.count());
        LOG.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @Test
    public void testFindAll() {
        LOG.info("^^^^^^^^^^^^^^^^^ All Users ^^^^^^^^^^^^^^^^^^^^^^^");
        Iterable<You> allUsers = notesRepository.findAll();
        for (You you : allUsers) {
            LOG.info("User login - " + you.getLogin());
        }
        LOG.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @Test
    public void testFindByLogin() {
        LOG.info("^^^^^^^^^^^^^^^^^ All notes of user aaa ^^^^^^^^^^^^^^^^^^^^^^^");
        You user = notesRepository.findByLogin("aaa");
        Set<Note> notes = user.getNotes();
        for (Note note : notes) {
            LOG.info("User note - " + note);
        }
//        Map<String, Note> notes = user.getNotes();
//        for (Map.Entry<String, Note> entry : notes.entrySet()) {
//            LOG.info("User note - " + entry);
//        }
        LOG.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @Test
    public void testFindByLoginLike() {
        LOG.info("^^^^^^^^^^^^^^^^^ All Users with login like c ^^^^^^^^^^^^^^^^^^^^^^^");
        Iterable<You> users = notesRepository.findByLoginLike("*c*");
        users.forEach(you -> LOG.info("User - " + you.toString()));
        LOG.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @Test
    public void testFindUsersWithNotesLike() {
        LOG.info("^^^^^^^^^^^^^^^^^ All Users with notes like 3 ^^^^^^^^^^^^^^^^^^^^^^^");
        Iterable<You> users = notesRepository.findByNotesTitleLike("*3*");
        users.forEach(you -> LOG.info("User - " + you.toString()));
        LOG.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @After
    public void clean() {
        notesRepository.deleteAll();
    }
}
