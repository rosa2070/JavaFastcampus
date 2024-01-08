package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatSuperTest {
    public static void main(String[] args) {
        // Upcasting(업캐스팅)
        // 부모가 자식을 가리킨다.
        Animal ani = new Dog();
        ani.eat(); // 동물처럼 먹다 -> 개처럼 먹다

        ani = new Cat();
        ani.eat(); // 동물처럼 먹다 -> 고양이처럼 먹다
    }
}
