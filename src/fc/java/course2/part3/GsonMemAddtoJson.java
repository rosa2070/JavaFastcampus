package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Address;
import fc.java.course2.model3.Person;

public class GsonMemAddtoJson {
    public static void main(String[] args) {
        Address address=new Address("서울", "대한민국");
        Person member=new Person("홍길동", 30, "bit@empas.com", address);

        // Person -> JSON
        Gson gson=new Gson();
        String json=gson.toJson(member);
        System.out.println("json = " + json);

    }
}
