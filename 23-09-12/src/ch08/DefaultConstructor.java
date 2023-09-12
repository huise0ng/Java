package ch08;

//클래스에는 필드와 메서드 뿐만 아니라 생성자라는 것이 존재한다.
//생성자는 new를 통해서 객체생성을 가능하게 해주는 존재이다.
//필수 요소이기 때문에 없어서는 안되고, 개발자가 생성자를 넣지 않았다면 컴파일러가 대신 넣어준다.
class A {
    int m;

    void work() {
        System.out.println(m);
    }

    // 이게 바로 생성자 인데 안넣으면 컴파일러가 알아서 해준당
    A() {

    }
}

class B {
    int m;

    void work() {
        System.out.println(m);
    }
    // 생성자 이름은 반드시 클래스 이름과 동일해야한당

    B() {

    }
}

class C {
    int m;

    void work() {
        System.out.println(m);
    }
    // 이런 식으로 매개변수가 들어간 형태의 생성자도 정의 할 수 있다.
    // 단 이런 경우에 컴파일러가 디폴트 생성자를

    C(int a) {
        m = a;
    }
}

public class DefaultConstructor {

    public static void main(Stirng[] args) {
        // 생성자로 객체 생성하기
        A a = new A();
        B b = new B();
        C c = new C();
    }
}
