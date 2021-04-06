package edu.kis.powp.jobs2d.drivers.composite;

/**
 * Represents a hierarchy of objects.
 * @param <T> The type of elements in the hierarchy.
 */
public interface IComposite<T> {
    void add(T item);
    void remove(T item);
    T[] getChildren();
}
