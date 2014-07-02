package entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    List<Word> words = new ArrayList<Word>();

    public Sentence(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words:" + words +
                '}';
    }
}
