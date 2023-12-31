package fc.java.part2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int num = scan.nextInt(); // 블럭상태(프로그램이 잠깐 멈춘 상태)
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요:");
        float f = scan.nextFloat(); // 블럭상태
        System.out.println("f = " + f);

        System.out.print("문자열을 입력하세요:");
        String str = scan.next(); // Hello World 입력 시 Hello까지만 읽어들임
        System.out.println("str = " + str);

        scan.nextLine(); // 버퍼비우기(스트림 비우기)

        System.out.print("문자열을 입력하세요:");
        String str1 = scan.nextLine();
        System.out.println("str = " + str1);

        // Scanner를 다 사용하면 scan.close()를 이용해 스트림을 끊어줌
        scan.close();
    }
}
