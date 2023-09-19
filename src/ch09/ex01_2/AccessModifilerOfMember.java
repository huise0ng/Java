package src.ch09.ex01_2;

import ex01_1.A;
import ex01_2.A;
import src.ch09.ex01_1.B;
import src.ch09.ex01_3.C;
import src.ch09.ex01_3.D;

public class AccessModifilerOfMember {

    public static void main(String[] args) {
        src.ch09.ex01_1.A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}
