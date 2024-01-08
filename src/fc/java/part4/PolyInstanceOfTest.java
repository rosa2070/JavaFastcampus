package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyInstanceOfTest {
    public static void main(String[] args) {
        Dog d=new Dog();
        display(d);
        Cat c=new Cat();
        display(c);

    }

    // overloading
    private static void display(Animal ani) { // 다형성인수
        ani.eat();
        // Cat타입으로 받은 경우에만 실행 -> if
        if(ani instanceof Cat) {
            ((Cat)ani).night();
        }
    }
}
