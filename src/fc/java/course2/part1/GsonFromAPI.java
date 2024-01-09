package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        // JSON -> Person
        String json="{\"name\":\"John\",\"age\":30}"; // 쌍따옴표(")안 쌍따옴표(\")
        Gson gson=new Gson();
        Person p=gson.fromJson(json, Person.class); // json타입을 Person타입으로
        System.out.println(p.getName()); // John
        System.out.println(p.getAge()); // 30
        System.out.println(p.toString());

    }
}
