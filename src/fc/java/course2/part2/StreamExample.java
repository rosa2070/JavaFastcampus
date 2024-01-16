package fc.java.course2.part2;

import java.util.*;
import java.util.function.Predicate;

public class StreamExample {
    public static boolean isEven(int number) {
        return number%2==0;
    }
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // 자바에서 제공된 함수형 인터페이스를 사용한 짝수 여부 판별
        Predicate<Integer> isEven= n->n%2==0;

        // 스트림 API를 사용해 짝수만 필터링, 정렬, 제곱하고, 합계를 계산
        int sumOfSquares=numbers.stream()
                .filter(StreamExample::isEven) // n->n%2==0 isEven.test(?)
                .sorted()
                .map(n->n*n)
                .reduce(0,Integer::sum);
        System.out.println("sumOfSquares = " + sumOfSquares); // 220
    }
}
