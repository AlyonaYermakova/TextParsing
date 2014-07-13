package entity;

import parser.Parser;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends AbstractCompoundText<Sentence> implements TextPart {
    public Paragraph() {
    }

    public Paragraph(String paragraph) {
        getElements().addAll(Parser.parseSentence(paragraph));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Sentence sentence : getElements()) {
            builder.append(sentence.toString());
        }
        builder.append("\n");
        return builder.toString();
    }
}
