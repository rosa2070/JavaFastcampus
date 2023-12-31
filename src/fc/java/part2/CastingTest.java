package fc.java.part2;

public class CastingTest {
    public static void main(String[] args) {
        float f1=.10f; //0.10
        System.out.println("f1 = " + f1); //0.10
        float f2=15f; //15.0
        System.out.println("f2 = " + f2); //15.0
        float f3=3.14f; //float형은 무조건 뒤에 f붙여야 함. 안그러면 double형으로 인식
        System.out.println("f3 = " + f3);
        double d1=123.4567;
        System.out.println("d1 = " + d1);

        float x=15.6f;
        int y=(int)x; //강제형변환(손실)
        System.out.println("y = " + y); //15

        char c='A';
        int cc=c; // cc는 4byte, c는 2byte이므로 자동형변환
        System.out.println("cc = " + cc); // 65

        int dd=5;
        double ddd=dd; //ddd는 8byte, dd는 4byte이므로 자동형변환
        System.out.println("ddd = " + ddd); // 5.0

        double dx=14.67;
        int dy=(int)dx;
        System.out.println("dy = " + dy); // 14
    }
}
