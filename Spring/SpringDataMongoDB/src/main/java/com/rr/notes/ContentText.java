package com.rr.notes;

/**
 * @author roman.rudenko on 15-Apr-16.
 */
public class ContentText implements Content {
    private String text;

    public ContentText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ContentText{" +
                "text='" + text + '\'' +
                '}';
    }
}
