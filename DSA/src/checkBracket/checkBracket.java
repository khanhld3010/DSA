package checkBracket;

import java.util.Arrays;
import java.util.Stack;

public class checkBracket {
    static void main(String[] args) {
        String str1 = "s * (s – a) * (s – b) * (s – c)";    //? true
        String str2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";     //? true
        String str3 = "s * (s – a) * (s – b * (s – c)";     //? false
        String str4 = "s * (s – a) * s – b) * (s – c)";     //? false
        String str5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";   //? false

        boolean checkBracket1 =  checkBracketString(str1);
        display(checkBracket1,1);
        boolean checkBracket2 =  checkBracketString(str2);
        display(checkBracket2,2);
        boolean checkBracket3 =  checkBracketString(str3);
        display(checkBracket3,3);
        boolean checkBracket4 =  checkBracketString(str4);
        display(checkBracket4,4);
        boolean checkBracket5 =  checkBracketString(str5);
        display(checkBracket5,5);


    }
    static void display(boolean checkBracket, int number){
        if (checkBracket){
            System.out.println("biểu " +number+ " thức đúng ngoặc");
        }else {
            System.out.println("biểu " +number+ " thức không đúng ngoặc");
        }
    }

    static boolean checkBracketString(String str) {
        Stack<String> stackStr = new Stack<>();
        String[] arrString = str.split("");
        System.out.println(Arrays.toString(arrString));
        for (String s : arrString) {
            if (s.equals("(")) {
                stackStr.push(s);
            }
            if (s.equals(")")){
                if (stackStr.size() == 0){
                    return false;
                }else {
                    stackStr.pop();
                }
            }
        }
        if (stackStr.size() != 0){
            return false;
        }
        return true;
    }
}
