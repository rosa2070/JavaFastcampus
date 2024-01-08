package fc.java.part4;

import fc.java.model.*;

public class PolyMethodTest {
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
        // ((Cat)ani).night(); // Cat
    }

}