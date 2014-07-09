package entity;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends AbstractCompoundText<Sentence> implements TextPart {
    public List<Paragraph> paragraphs = new ArrayList<>();

    public Paragraph(List<Paragraph> paragraphs) {
        super();
        this.paragraphs = paragraphs;
    }


}
