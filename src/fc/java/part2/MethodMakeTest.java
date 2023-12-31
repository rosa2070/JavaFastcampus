package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        // add 라는 메서드를 호출(call)하여 두수의 합의 결과를 받아보자.
        int result = add(a,b);
        System.out.println("result = " + result);
    }
    // Q. [매개변수로 2개의 정수를 받아서] [총합을 구하여] [리턴] 하는 [메서드를 정의]하세요.

    // static이 붙은 메서드 안에서 호출할 때는 호출되는 메서드도 static이 붙어있어야 한다
    public static int add(int a, int b) {
        int sum=a+b;
        return sum;
    }
}
