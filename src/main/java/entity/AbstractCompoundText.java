package entity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCompoundText<T extends TextPart> implements CompoundText {
    public List<T> components;

    public AbstractCompoundText() {
        this.components = new ArrayList<>();
    }
}
