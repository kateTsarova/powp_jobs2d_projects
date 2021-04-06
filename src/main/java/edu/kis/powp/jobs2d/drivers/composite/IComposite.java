package edu.kis.powp.jobs2d.drivers.composite;

public interface IComposite<T> {
    void add(T item);
    void remove(T item);
    T[] getChildren();
}
