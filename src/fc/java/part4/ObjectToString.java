package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b=new Board();
        b.setTitle("게시글입니다.");
        //System.out.println(b.getTitle());
        // 객체의 번지를 문자열로 출력
        System.out.println(b.toString()); // 번지(fc.java.poly.Board@17c68925) -> 게시글입니다.
        System.out.println(b); // 번지(fc.java.poly.Board@17c68925) -> 게시글입니다.
    }
}
