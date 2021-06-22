package ua.mamedov;

public class Box<T extends Goods> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}
