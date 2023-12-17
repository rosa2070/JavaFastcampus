public class CharTest {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("c = " + c); // A
        //'A'를 컴퓨터에서 수치형 자료로 인식하기 때문에 int형으로 선언 가능
        // 'A'의 수치값인 65가 들어감
        int a = 'A';
        System.out.println("a = " + a);
        // 'B'의 수치값인 66과 1을 더함
        int b = 'B' + 1;
        //char을 통해 casting(형변환) : int형을 char형으로 바꾸자
        System.out.println("b = " + (char)b); // 67->c

        // Q. '가'라는 한글 한 문자를 변수에 저장하고 출력하시오.
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가'; //44032
        System.out.println("hanD = " + hanD);
        int hanU = '\uAC00'; // 16진수로 표현
        System.out.println("hanU = " + (char)hanU);

        // Q. 대문자 'A'를 문자 'a'로 변환하여 출력하시오.(ASCII코드 참고)
        char upper= 'A'; //65
        // upper+32 = 97 정수형(4byte)인데 lower는 char, 즉 2byte이므로 오류발생
//      char lower = upper +32;
        char lower = (char)(upper+32);
        System.out.println("lower = " + lower); //'a'

        char lower1 = 'u'; // 117
        int upper1 = lower1 - 32; // 117 - 32 = 85(U)
        System.out.println("upper1 = " + (char)upper1); //85->U

        //Q. '1' + '2' = 3이 나오도록 프로그래밍
        //'1'은 49이고 '2'는 50이다
        int data = '1' + '2';
        System.out.println("data = " + data); // 99
        //'0'=48
        char i='1'; // 49-48=1
        char j='2'; // 50-48=2
//        int sum = (i-48)+(j-48);
        int sum = (i-'0')+(j-'0');
        System.out.println("sum = " + sum); //3




    }
}
