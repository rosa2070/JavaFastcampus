package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.TV;

public class InterfaceRemocon {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작시켜보자.
        // 다형성이 100% 보장이 된다.
        // 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬 수가 있다.
        //RemoCon r = new RemoCon(); 추상클래스나 인터페이스는 객체 생성 불가
        // 부모의 역할을 할 수 있다
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // Radio 에서는 인터넷이 지원이 안됩니다.

        remo=new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // TV 에서 인터넷이 실행된다.
    }
}
