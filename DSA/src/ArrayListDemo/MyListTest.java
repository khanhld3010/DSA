package ArrayListDemo;

public class MyListTest {
    static void main(String[] args) {
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<Integer>();
        integerMyArrayList.add(1);
        integerMyArrayList.add(2);
        integerMyArrayList.add(3);
        integerMyArrayList.add(4);
        integerMyArrayList.add(5);

        System.out.println("element 4: "+integerMyArrayList.get(4));
        System.out.println("element 1: "+integerMyArrayList.get(1));
        System.out.println("element 2: "+integerMyArrayList.get(2));

//        integerMyArrayList.get(6);
//        System.out.println("elenment 6: "+integerMyArrayList.get(6));
//        integerMyArrayList.get(-1);
        System.out.println("element -1: "+integerMyArrayList.get(-1));
    }
}
