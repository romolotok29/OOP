import java.util.Arrays;

public class Custom<T> {

    private final int DEFAULT_SIZE = 10;
    private Object [] array;
    private int size;

    public Custom() {
        this.array = new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public Custom(int initialSize) {
        if (initialSize < 0) {
            throw new IllegalArgumentException("Illegal size : " + initialSize);
        }
        this.array = new Object[initialSize];
        this.size = 0;
    }

    public void add (T element) {
        array[size++] = element;
    }

    public void delete (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size--] = null;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) array [index];
    }

    public boolean contains (T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear () {
        Arrays.fill(array, null);
        size = 0;
    }

    public void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }
    
    public int size () {
        return size;
    }
}
