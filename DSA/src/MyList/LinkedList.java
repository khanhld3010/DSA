package MyList;

import LinkedListDemo.MyLinkedList;

public class LinkedList<E> {
    private Node head;
    private int numNodes;

    public LinkedList() {
        this.head = null;
        numNodes = 0;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, E data) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Vị trí chèn không hợp lệ: " + index);
        }
        Node temp = head;
        Node holder;
        if (index == 0) {
            addFirst(data);
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
            numNodes++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Vị trí chèn không hợp lệ: " + index);
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = head.data;
            head = head.next;
            numNodes--;
            return (E) data;
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        data = temp.next.data;
        temp.next = temp.next.next;
        numNodes--;
        return (E) data;
    }

    public boolean remove(Object e) {
        if (head == null) return false;
        if (head.data.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node temp = head;
        //* khi temp.next == null thi day la phan tu cuoi cung
        while (temp.next != null) {
            if (temp.next.data.equals(e)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public E getFirst() {
        if (head == null) {
            return null;
        }
        return (E) head.data;
    }

    public E getLast() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E get(int index) {
        // 1. Kiểm tra index hợp lệ (từ 0 đến numNodes - 1)
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Vị trí không hợp lệ");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public int indexOf(E o) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if ((o == null && temp.data == null) || (o != null && o.equals(temp.data))) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public int size() {
        return this.numNodes;
    }

    public LinkedList<E> clone() {
        LinkedList<E> newSub = new LinkedList<>();
        Node temp = head;
        while (temp != null) {
            newSub.addLast((E) temp.data);
            temp = temp.next;
        }
        return newSub;
    }
}
