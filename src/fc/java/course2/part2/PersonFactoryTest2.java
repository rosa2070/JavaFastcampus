package fc.java.course2.part2;

import fc.java.model2.Person;
import fc.java.model2.PersonFactory;

public class PersonFactoryTest2 {
    public static void main(String[] args) {
        // 람다표현식 사용
        PersonFactory personFactory=(name, age)->new Person(name,age);
        Person person=personFactory.create("John Doe", 30);
        System.out.println(person);
    }
}
