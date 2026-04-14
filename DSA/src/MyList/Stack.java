package MyList;

import java.util.Arrays;

public class Stack {
    public static void main(String[] args) {
        // 1. Khởi tạo mảng số nguyên
        int[] mang = {10, 20, 30, 40, 50};
        System.out.println("Mang ban dau: " + Arrays.toString(mang));
        // Gọi hàm đảo ngược
        daoNguoc(mang);
        System.out.println("Mang sau khi dao nguoc: " + Arrays.toString(mang));
        String cauVan = "Học lập trình cùng đối tác";
        String newCauvan = reverseString(cauVan);
        System.out.println(newCauvan);
    }

    private static String reverseString(String cauVan) {
        String[] cacTu = cauVan.split(" ");
        java.util.Stack<String> stack = new java.util.Stack<>();
        for (int i = 0; i < cacTu.length; i++) {
            stack.push(cacTu[i]);
        }
        for (int i = 0; i < cacTu.length; i++) {
            cacTu[i] = stack.pop();
        }
        return String.join(" ", cacTu);

    }

    private static void daoNguoc(int[] mang) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < mang.length; i++) {
            stack.push(mang[i]);
        }
        for (int i = 0; i < mang.length; i++) {
            mang[i] = stack.pop();
        }
    }
}
