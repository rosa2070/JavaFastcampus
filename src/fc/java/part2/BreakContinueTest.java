package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        // char[] c={'s','h','u','t','d','o','w','n'}; 위 배열의 값을 출력 중
        // 'o'라는 문자를 만나면 반복을 중지하세요
        char[] c={'s','h','u','t','d','o','w','n'};

        for(int i=0;i<c.length;i++) {
            if(c[i]=='o') break; // break만나면 아래 문장 실행 안하고 빠져나옴
            System.out.println(c[i]);
        }

        // Q. 1~10까지의 수 중 3의 배수의 개수를 구하여 출력하세요
        for(int i=1;i<=10;i++) {
            if(i%3 != 0) continue;
            System.out.println(i);
        }
    }
}
