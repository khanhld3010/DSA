package MyList;

public class MyArrayListTest {
    static void main(String[] args) {
        System.out.println("=== BẮT ĐẦU CHẠY THỬ NGHIỆM MyList ===");

        // 1. Khởi tạo danh sách với sức chứa ban đầu là 3 để dễ ép nó phải "Nới rộng"
        ArrayList<String> classRoom = new ArrayList<>(3);

        // 2. Thử thêm phần tử vào cuối (add)
        System.out.println("\n--- Bước 1: Thêm học sinh ---");
        classRoom.add("An");
        classRoom.add("Bình");
        classRoom.add("Châu");
        // Học sinh thứ 4 này sẽ kích hoạt hàm ensureCapacity (vì capacity ban đầu chỉ là 3)
        classRoom.add("Dũng");
        classRoom.printList();

        // 3. Thử chèn phần tử vào giữa (add by index)
        System.out.println("\n--- Bước 2: Chèn học sinh ---");
        classRoom.add(1, "Hoa"); // Chèn Hoa vào vị trí số 1 (giữa An và Bình)
        System.out.println("Đã chèn 'Hoa' vào vị trí số 1.");
        classRoom.printList();

        // 4. Thử lấy và xóa phần tử (get & remove)
        System.out.println("\n--- Bước 3: Xem và Xóa học sinh ---");
        System.out.println("Học sinh ở vị trí số 2 là: " + classRoom.get(2));
        String removedStudent = classRoom.remove(2); // Xóa người ở vị trí số 2 (Bình)
        System.out.println("Đã xóa học sinh: " + removedStudent);
        classRoom.printList();

        // 5. Thử tìm kiếm (indexOf & contains)
        System.out.println("\n--- Bước 4: Tìm kiếm ---");
        System.out.println("Lớp có bạn 'Châu' không? " + classRoom.contains("Châu"));
        System.out.println("Vị trí ghế của 'Châu' là: " + classRoom.indexOf("Châu"));
        System.out.println("Lớp có bạn 'Tuấn' không? " + classRoom.contains("Tuấn"));

        // 6. Thử nhân bản (clone)
        System.out.println("\n--- Bước 5: Nhân bản lớp học ---");
        ArrayList<String> clonedClass = classRoom.clone();
        System.out.println("Đã tạo bản sao.");
        clonedClass.printList();

        // 7. Thử dọn dẹp lớp gốc (clear)
        System.out.println("\n--- Bước 6: Giải tán lớp gốc ---");
        classRoom.clear();
        System.out.println("Lớp gốc sau khi gọi clear():");
        classRoom.printList();

        System.out.println("\nLớp bản sao (không bị ảnh hưởng):");
        clonedClass.printList();
    }
}
