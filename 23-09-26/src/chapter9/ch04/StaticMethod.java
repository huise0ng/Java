package ch04;

class A {
    // instance methond
    void abc() {
        System.out.println(instance method);
    }

    // static method
    static void bcd() {
        System.out.println(static method);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        A a1 = new A();
        a1.abc();

        //static 매서드는 클래스 명으로 바로 접근이가능하다.
        A.bcd();

        //static 매서드 활용 - 객체를 생성하는 방식을 권장하지 않음
        A a2 = new A();
        a2.bcd;
    }
}
