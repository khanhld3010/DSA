package convertDecimalToBinary;

import java.util.Arrays;
import java.util.Stack;

public class convertToBinary {
    static void main(String[] args) {
        int number = 30;
        int[] binaryNumber = convertDecimalToBinary(number);
        System.out.println("Số nhị phân của " + number + " là: " + Arrays.toString(binaryNumber));
    }

    private static int[] convertDecimalToBinary(int i) {
        Stack<Integer> stack = new Stack<>();
        int quotientNumber = i;
        do {
            int remainder = quotientNumber % 2;
            stack.push(remainder);
            quotientNumber /= 2;
        } while (quotientNumber != 0);
        int[] binaryNumber = new int[stack.size()];
        for (int j = 0; j < binaryNumber.length; j++) {
            binaryNumber[j] = stack.pop();
        }
        return binaryNumber;
    }
}
