import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;


    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        size++;
        begin = previousIndex(begin);
        list[begin] = item;

    }

    public T peekRight() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[previousIndex(end)];
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        end = previousIndex(end);
        list[end] = null;
        return temp;
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        size++;
        list[end] = item;
        end = nextIndex(end);


    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int previousIndex(int index) {
        return index == 0 ? list.length - 1 : index - 1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int ind = begin;
        for (int i = 0; i < size; i++) {
            sb.append(list[ind]).append(", ");
            ind++;
            if (ind == list.length) {
                ind = 0;
            }
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
