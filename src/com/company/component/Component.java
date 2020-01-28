package com.company.component;

public abstract class Component {
    private String text;
    private String tag;
    private String id;

    public Component(String text, String tag, String id) {
        this.text = text;
        this.tag = tag;
        this.id = id;
    }

    public Component(String tag) {
        this.tag = tag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
