package entity;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    List<Sentence> sentences = new ArrayList<Sentence>();

    public Paragraph(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "sentences:" + sentences +
                '}';
    }
}
