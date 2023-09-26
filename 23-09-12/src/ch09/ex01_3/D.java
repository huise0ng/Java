package src.ch09.ex01_3;

import ex01_1.A;

//A를 햇다는 것은 A가 부모, D가 A로 자식클래스로 사용하겠당아아아아아ㅏ
//그렇기 때문에 A의 자식이 되는 순간 A의 필드, 메서드가 D의 모두 복사가 된다. 
public class D extends A {
    public void print() {
        A a = new A();
        System.out.print(a.a + " ");
        // System.out.print(a.b+ " ");
        // System.out.print(a.c+ " ");
        System.out.print(a.d + " ");
    }
}
