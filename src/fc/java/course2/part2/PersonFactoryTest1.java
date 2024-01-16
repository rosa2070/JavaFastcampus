package fc.java.course2.part2;

import fc.java.model2.Person;
import fc.java.model2.PersonFactory;

public class PersonFactoryTest1 {
    public static void main(String[] args) {
        // 익명내부클래스
        PersonFactory personFactory=new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person=personFactory.create("나길동", 32);
        System.out.println(person);
    }
}
