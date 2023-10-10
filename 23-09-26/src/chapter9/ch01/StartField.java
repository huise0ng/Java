package ex02;

class A {
    // 필드의 종류에는 인스턴트 필드, 스택틱필드가있다. 스태틱 필드가있다.
    // 인스턴트 필드
    int m = 3;

    // 스태틱필드
    static int n = 5;
}

public class StartField {
    public static void main(String[] args) {
        System.out.println();
        // A a1 = new A()
        // //인스턴트 활용법 - 반드시 new A() 객체를 만들고 사용해야 한당

        // System.out.println(a1.m);
        // 스태틱 필드 활용법 - new를 통해 객체를 만들 필요 없이 클래스명 필드명으로 바로 사용가능
        // System.out.println(A.n);

        // 스태틱 필드도 객체를 생성해서 사용히 가능하기는 하는구낭 하지만 권장하지는 않음
        A a2 = new A();
        System.out.println(a2.n);
    }
}
