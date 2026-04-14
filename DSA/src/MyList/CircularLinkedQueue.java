package MyList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedQueue {
    private Node front;
    private Node rear;

    public CircularLinkedQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = rear = newNode;
            rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
        System.out.println("Đã thêm " + value + " vào hàng đợi.");
    }

    public void deQueue() {
        if (front == null) {
            System.out.println("Hàng đợi trống! Không thể lấy phần tử.");
            return;
        }
        int value = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        System.out.println("Đã lấy " + value + " ra khỏi hàng đợi.");
    }

    public void display() {
        if (front == null) {
            System.out.println("Hàng đợi đang trống.");
            return;
        }

        System.out.print("Các phần tử trong hàng đợi: ");
        Node temp = front;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != front); // Dừng lại khi vòng lặp quay về Front
        System.out.println("(quay lại Front)");
    }

    public static void main(String[] args) {
        CircularLinkedQueue queue = new CircularLinkedQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.display(); // 10 -> 20 -> 30 -> (quay lại Front)

        queue.deQueue(); // Lấy 10 ra
        queue.display(); // 20 -> 30 -> (quay lại Front)

        queue.enQueue(40);
        queue.display(); // 20 -> 30 -> 40 -> (quay lại Front)
    }
}
