package src.ch09.ex01_1;

public class B {
    public void print() {
        // A클래스의 객체를 생성
        A a = new A();

        // 맴버 활용
        System.out.print(a.a + " ");
        System.out.print(a.b + " ");
        System.out.print(a.c + " ");
        System.out.print(a.d + " ");
    }
}
