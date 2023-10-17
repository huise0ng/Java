package ex03;

// class A 는 부모가 없느 것 ㅊ처럼 보이지만 자동으로 extends object가 붙으면서 최상위 클래스인 
//Object 의 자식이 된다. 
class A {
    int m = 3;

    void abc() {
        System.out.println("A클래스");
    }

    // toString는 클래스를 설명하는 용도로 사용한다.
    @Override
    public String toString() {
        return "안녕 나는 클래스 A야 필드m과 abc를 가지고 있징";
    }
}

class B extends A {
    int n = 4;

    void bcd() {
        System.out.println("B클래스");
    }

}

    @Override
    void abc() {
        System.out.println("A 클래스 것을 재정의 함");
    }

public class TypeCasting {
    public static void main(String[] args) {
        A aa = new A();
        //toString()는 Object 클래스로 부터 상속 받은 메서드 이다. 
        System.out.println(aa.toString());
        System.out.println(aa.m);
        aa.abc();

        B bb = new B();
        System.out.println(bb.toString());
    }
}
