import MyList.LinkedList;

public class LinkedListTest {
    static void main(String[] args) {
        System.out.println("=== KIỂM THỬ MY LINKED LIST ===");
        LinkedList<String> list = new LinkedList<>();
        // 1. Thêm dữ liệu
        list.addFirst("Java");
        list.addLast("Python");
        list.add(1, "C++");
        System.out.println("Kích thước sau khi thêm: " + list.size()); // Sẽ là 3
        System.out.println("Phần tử đầu: " + list.getFirst());
        System.out.println("Phần tử cuối: " + list.getLast());
        // 2. Kiểm tra tìm kiếm
        System.out.println("Vị trí của Python: " + list.indexOf("Python"));
        System.out.println("Có chứa PHP không? " + list.contains("PHP"));
        // 3. Xóa dữ liệu
        System.out.println("Xóa phần tử tại vị trí 1: " + list.remove(1)); // Xóa C++
        System.out.println("Xóa phần tử 'Java': " + list.remove("Java"));
        // 4. Kết quả cuối cùng
        System.out.println("Danh sách còn lại bao nhiêu? " + list.size());
        if (list.size() > 0) {
            System.out.println("Phần tử còn lại: " + list.get(0));
        }
        list.clear();
        System.out.println("Sau khi clear, size = " + list.size());
    }
}

