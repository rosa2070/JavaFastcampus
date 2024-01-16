package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10,20,30,40,50 5개의 정수를 저장하고 출력하세요
        // ArrayList -> Object[] <--X-- int
        // ArrayList -> Object[] <--X-- Integer(Wrapper)
        // ArrayList -> Object[] <--(Auto-boxing:Integer)-- int
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10); // new Integer(10);  (Auto-boxing)
        list.add(20); // new Integer(20);  (Auto-boxing)
        list.add(30); // new Integer(30);  (Auto-boxing)
        list.add(40); // new Integer(40);  (Auto-boxing)
        list.add(50); // new Integer(50);  (Auto-boxing)
        // int <-(Auto-unboxing)--Integer
        for (int data : list) {
            System.out.println(data);
        }

    }
}
