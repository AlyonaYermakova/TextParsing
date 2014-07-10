package entity;

public class Text extends AbstractCompoundText<Paragraph> implements TextPart {
    String inputText;

    public Text(String inputText) {
        this.inputText = inputText;
    }

    @Override
    public String toString() {
        return "Text{" +
                "inputText='" + inputText + '\'' +
                '}';
    }
}
