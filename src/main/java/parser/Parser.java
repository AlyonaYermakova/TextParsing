package parser;

import entity.Paragraph;
import entity.Text;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static Text parseText(String inputText) {
        Text text = new Text(inputText);
        return text;
    }

}

