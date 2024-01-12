package fc.java.course2.part1;
// import java.lang.*; (생략되어 있음)
public class HelloWorldString {
    public static void main(String[] args) {
        String str=new String("HelloWorld"); // Heap
        System.out.println(str.toString());

        String str1="HelloWorld"; // Literal Pool
        System.out.println(str.toString());

    }
}
