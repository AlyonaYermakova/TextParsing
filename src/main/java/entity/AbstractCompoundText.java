package entity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCompoundText<E extends TextPart> implements CompoundText<E> {
    private List<E> elements;

    AbstractCompoundText() {
        elements = new ArrayList<>();
    }

    public List<E> getElements() {
        return elements;
    }

    public void setElements(List<E> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (E element : elements) builder.append(element.toString());
        return builder.toString();
    }

    @Override
    public void add(E element) {
        elements.add(element);
    }
}
