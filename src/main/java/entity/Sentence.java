package entity;

import parser.Parser;

public class Sentence extends AbstractCompoundText<Word> implements TextPart {
    public Sentence() {
    }

    public Sentence(String sentence) {
        getElements().addAll(Parser.parseWords(sentence));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
