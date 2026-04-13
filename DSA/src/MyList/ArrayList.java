package MyList;

import java.util.Arrays;

public class ArrayList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //* Sử dụng để khởi tạo mảng với số độ dài truyền vào
    public ArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Sức chứa không hợp lệ capacity: " + capacity);
        }
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Vị trí chèn không hợp lệ: " + index);
        }
        //* đảm bảo mảng có đủ chỗ trống
        ensureCapacity(size + 1);
        //* dịch sang phải 1 vị trí
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size = size + 1;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Vị trí xóa không hợp lệ: " + index);
        }
        E elementRemoved = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size = size - 1;
        return elementRemoved;
    }

    public int size() {
        return this.size;
    }

    public ArrayList<E> clone() {
        ArrayList<E> cloneList = new ArrayList<>();
        cloneList.elements = Arrays.copyOf(this.elements, this.elements.length);
        cloneList.size = this.size;
        return cloneList;
    }

    public boolean contains(E o) {
        if (indexOf(o) != -1) {
            return true;
        }
        return false;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity(size+1);
        elements[size] = e;
        size = size+1;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            //* Nếu gấp đôi lên mà vẫn không đủ
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
            System.out.println("=> Mảng đã đầy! Tự động nới rộng lên kích thước: " + newCapacity);
        }
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Vị trí lấy dữ liệu không hợp lệ: " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public void printList() {
        System.out.print("Danh sách hiện tại: [ ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.get(i) + (i < size - 1 ? ", " : ""));
        }
        System.out.println(" ] | Sĩ số: " + this.size);
    }
}
