package util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class SimpleParsing {
    private static final Logger log = Logger.getLogger(SimpleParsing.class);

    public static List<String> parseParagraphs(String s) {
        String[] strings = s.split("\\n+");
        List<String> paragraphs = new ArrayList<>();
        for (String string : strings) {
            paragraphs.add(new String(string));
        }
        return paragraphs;
    }

    public static List<String> parseSentences (String s){
        String[] strings = s.split("[.!?]");
        List<String> sentences = new ArrayList<>();
        for (String string : strings) {
            sentences.add(new String(string));
        }
        return sentences;
    }


    public static List<String> parseWords(String s){
        String[] strings = s.split("\\s+");
        List<String> words = new ArrayList<>();
        for (String string : strings) {
            words.add(new String(string));
        }
        return words;
    }


    public static void printParsed(List<String> list) {
        for (String s : list) {
            log.info(s);
        }
    }
}

