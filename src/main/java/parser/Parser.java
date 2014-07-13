package parser;

import entity.*;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static Text parseText(String s) {
        return new Text(s);
    }

    public static List<Paragraph> parseParagraph(String text) {
        List<Paragraph> paragraphs = new ArrayList<>();
        String[] strings = text.split("\\n+");
        for (String string : strings) {
            paragraphs.add(new Paragraph(string));
        }
        return paragraphs;
    }

    public static List<Sentence> parseSentence(String paragraph) {
        List<Sentence> sentences = new ArrayList<>();
        String[] strings = paragraph.split("[.?!]");
        for (String string : strings) {
            sentences.add(new Sentence(string));
        }
        return sentences;

    }

    public static List<Word> parseWords(String sentence) {
        List<Word> words = new ArrayList<>();
        String[] strings = sentence.split("\\s+");
        for (String string : strings) {
            words.add(new Word(string));
        }
        return words;
    }
}