package entity;

public interface CompoundText<E extends TextPart> {

    void add(E element);
}
