package entity;

import java.util.ArrayList;
import java.util.List;

public class Text {
    List<Paragraph> paragraphList = new ArrayList<Paragraph>();

    public Text(List<Paragraph> paragraphList) {
        this.paragraphList = paragraphList;
    }

    public Text (String text){}

    @Override
    public String toString() {
        return "Text{" +
                "paragraps:" + paragraphList +
                '}';
    }
}
