package com.company.component;

public class ParagraphComponent extends Component {
    public ParagraphComponent(String text, String tag, String id) {
        super(text, tag, id);
    }

    public ParagraphComponent(String tag) {
        super(tag);
    }

    public ParagraphComponent create(String type) {
        return null;
    }
}
