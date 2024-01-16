package fc.java.course2.part2;

import fc.java.model2.Person;
import fc.java.model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        // 생성자 참조
        PersonFactory personFactory= Person::new;
        Person person=personFactory.create("홍길동", 40);
        System.out.println(person);
    }
}
