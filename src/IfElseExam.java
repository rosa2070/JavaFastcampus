import java.util.Scanner;

public class IfElseExam {
    public static void main(String[] args) {
        // Q. 년도를 입력 받아서 해당 년도가 윤년인지 아닌지를 판단하며 출력하는 코드를 작성하세요
        // 윤년 : 4의 배수인 년도 이거나(100으로 나누어 떨어지는 년도를 제외하고) 400의 배수인 년도
        Scanner scan = new Scanner(System.in);
        System.out.print("년도를 입력하세요:");
        int year = scan.nextInt();
        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
