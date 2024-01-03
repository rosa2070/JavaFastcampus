package fc.java.part4;

public class EmployeeInitTest {
    public static void main(String[] args) {
        // Q. 상속관계를 이용하여 사원 정보를 초기화(자식이 부모의 공간을 접근)하고 출력하세요
        RempVO vo = new RempVO("홍길동", 500, "010-1111-1111", "2022-10-10", "홍보부", true);
        System.out.println(vo.toString());
    }
}
