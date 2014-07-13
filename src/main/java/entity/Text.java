package entity;

import parser.Parser;

public class Text extends AbstractCompoundText<Paragraph> implements TextPart {
    public Text() {
    }

    public Text(String text) {
        getElements().addAll(Parser.parseParagraph(text));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
