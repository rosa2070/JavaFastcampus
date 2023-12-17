public class FindAPI {
    public static void main(String[] args) {
        int a; // 변수 선언
        // AAA b; 컴파일러가 AAA를 가지고 있지 않기에 에러 뜸
        a=10;
        System.out.println("a = " + a);
        // "APPLE" 문자열 저장하고 출력
        String s; //java.lang.String인데 java.lang이 생략되어 있음
        s = "APPLE";
        System.out.println("s = " + s);
        System.out.println(s.length()); //string class가 가진 length라는 동작

    }

}
