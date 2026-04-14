package checkPalindrome;

import java.util.*;

public class Palindrome {
    static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        if (checkPalindrome(str)){
            System.out.println("đây là chuỗi đối xứng");
        }else {
            System.out.println("đây không phải chuỗi đối xứng");
        }
    }

    private static boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        String strLowerCase = str.toLowerCase();
        char[] charArr = strLowerCase.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            stack.push(charArr[i]);
            queue.add(charArr[i]);
        }
        for (int i = 0; i < charArr.length; i++) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }
        return true;
    }
}
