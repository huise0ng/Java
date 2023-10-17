package ex05;

class A {
    void abc() {
        System.out.println("A클래스의 abc()");
    }
}

class B extends A {
    void bcd() {
        //super는 부모를 가리키다.
        //super는 덮어쓰기를 하기 전 부모의 원형을 되찾을 수 있다. 
        super.abc();
    }


    @Override
    void abc() {
        System.out.println("B클래스의 abc()");
    }


}
public class superkeyword {
    public static void main(String[] args) {
        B bb = new B();

        bb.abc();
        bb.bcd();
    }
}
