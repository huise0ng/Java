package ex03;

class A {
    // instance
    int m = 3;
    // static
    static int n = 5;
}

public class StaticFiled_2 {
    public static void main(String[] args) {
        // 객체를 두개 만들거양
        A a1 = new A();
        A a2 = new A();

        // 인스턴스 필드
        a1.m = 5;
        a2.m = 6;

        System.out.println(a1.m);
        System.out.println(a2.m);

        // static 필드
        a1.n = 7;
        a2.n = 8;

        System.out.println(a1.n);
        System.out.println(a2.n);
    }
}
