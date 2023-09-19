package src.ch10;

class A {
    // 생성자
    A() {
        this(5);
        System.out.println("첫번째 생성자");
    }

    // 또다른 생성자 추가 가능 왜냐면 생성자 오버로딩 문법이 있기 때문
    A(int a) {
        System.out.println("두번째 생성자");
    }
    // this() 자신 외의 또 다른 생성자를 호출할 때 사용 //개발할 때 자주사용안함
    // this. 지역변수가 아닌 필드를 가리킬 때 사용 // 개발할 때 자주 사용
}

public class ThisMethod {

    public static void main(String[] args) {
        A val = new A(10); // 생성자 호출
    }
}
