public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6f;
        boolean b = false;
        char c = 'A';
        String s = "APPLE"; // java.lang의 String
        // Q. 69를 10진수, 2진수, 8진수, 16진수로 출력하시요?(BinaryTest 클래스)
        int decimal = 69;
        System.out.println("decimal = " + decimal);
        int binary = 0b01000101; //0b가 앞에 있으므로 이진수로 인식
        System.out.println("binary = " + binary);
        int octal = 0105;
        System.out.println("octal = " + octal); // 숫자 0이 앞에 있으면 8진수로 인식
        int hexa = 0x45; // 앞에 0x가 붙으면 16진수로 인식
        System.out.println("hexa = " + hexa);
    }
}
