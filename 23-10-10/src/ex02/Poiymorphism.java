package ex02;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Poiymorphism {
    public static void main(String[] args) {
        //A가 될 수 있느냐?
        A a1 = new A(); //A는 A이다. 가능하다.
        A a2 = new B(); //B는 A이다. 가능하다.
        A a3 = new C(); //C는 A이다. 가능하다.
        A a4 = new D(); //D는 A이다. 가능하다. 
        //B가 될 수 있느냐?
        // B b1 = new A(); // A는 B이다. 불가능하다.
        B b2 = new B(); // B는 B이다. 가능하다.
        B b3 = new C(); // C는 B이다. 가능하다.
        B b4 = new D(); // D는 B이다. 가능하다.
        //C가 될 수 있느냐?
        C c1 = new A(); // A는 B이다. 불가능하다.
        C c2 = new B(); // B는 C이다. 불가능하다.
        C c3 = new C(); // C는 C이다. 가능하다.
        C c4 = new D(); // D는 B다. 불가능하다.
        //D가 될 수 있느냐?
        D d1 = new A(); // A는 B이다. 불가능하다.
        D d2 = new B(); // B는 C이다. 불가능하다.
        D d3 = new C(); // C는 C이다. 불가능하다.
        D d4 = new D(); // D는 B다. 가능하다.
    }


}
