package com.rr.notes;

import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author roman.rudenko on 15-Apr-16.
 */
public class You {
    @Id
    private String login;
    private Set<Note> notes;
//    private Map<String, Note> notes;

    public You(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    //    public Map<String, Note> getNotes() {
//        return notes;
//    }
//
//    public void setNotes(Map<String, Note> notes) {
//        this.notes = notes;
//    }
//
    public void addNote(Note note) {
        if (notes == null) notes = new HashSet<>();
        notes.add(note);
//        if (notes == null) notes = new HashMap<>();
//        notes.put(note.getTitle(), note);
    }

    @Override
    public String toString() {
        return "login='" + login + '\'';
    }
}
