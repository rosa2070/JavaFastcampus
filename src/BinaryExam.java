public class BinaryExam {
    public static void main(String[] args) {
        // API의 도움을 받아 2진수, 8진수, 16진수 출력
        int data = 123;
        // toBinaryString은 data를 이진수로 변경해주는 메서드
        // Integer은 java.lang의 Integer
        String binary = Integer.toBinaryString(data); // 0b1111011
        System.out.println("binary = " + binary);
        String octal = Integer.toOctalString(data);
        System.out.println("octal = " + octal); // 0173
        String hexa = Integer.toHexString(data);
        System.out.println("hexa = " + hexa); //0x7b

        int x = 123;
        System.out.println("x = " + x);
        int y = 0b1111011;
        System.out.println("y = " + y);
        int z = 0173;
        System.out.println("z = " + z);
        int u = 0x7B;
        System.out.println("u = " + u);

    }
}
