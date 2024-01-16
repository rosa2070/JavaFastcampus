package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsonToJson {
    public static void main(String[] args) {
        Member mvo=new Member("홍길동", 30, "bit@empas.com");
        // JSON -> {"name" : "홍길동", "age" : 30, "email" : "bit@empas.com" }
        // 객체생성
        Gson gson=new Gson();
        String json=gson.toJson(mvo);
        // Object(Member) -> JSON
        System.out.println("json = " + json); // ?

    }
}
