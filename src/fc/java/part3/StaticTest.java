package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //a+b=?
        // hap 메서드 call(호출)
        int sum=StaticTest.hap(10,20); // StaticTest. 생략 가능
        System.out.println(sum);

    }
    // Q. 매개변수로 2개의 정수를 입력받아서 / 총합을 구하여 / 리턴하는 / [메서드를 정의]하시오
    // static을 붙여야 hap이 static zone에 올라오므로 main에서 호출가능
    public static int hap(int a, int b) {
        int v=a+b;
        return v;
    }
}
