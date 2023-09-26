package src.ch09.ex01_3;

import ex01_1.A;

public class C {
    public void print() {
        A a = new A();
        System.out.print(a.a + " ");
        // System.out.print(a.b + " ");
        // System.out.print(a.c + " ");
        // System.out.print(a.d + " ");
        // 아하 다른 클래스에서는 프로텍티드디폴트 프라이벗트 모두 사용 불가네... 너무 아쉽당
    }

}
