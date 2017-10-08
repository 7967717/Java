package com.rr.notes;

import org.springframework.data.annotation.Id;

/**
 * @author roman.rudenko on 15-Apr-16.
 */
public class Note {
    @Id
    private String title;
    private Content content;

    public Note(String title, Content content) {
        this.title = title;
        this.content = content;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (!title.equals(note.title)) return false;
        return content != null ? content.equals(note.content) : note.content == null;

    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", content=" + content +
                '}';
    }
}
