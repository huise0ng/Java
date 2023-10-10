package ch05;

class A {
    int a;
    static int b;

    // 아래는 생성자, 생성자는 주로 인스턴스 필드를 초기화 함.
    A() {
        a = 3;
    }
}

public class Staticinitiablock {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);
    }
}
