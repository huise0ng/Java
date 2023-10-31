package chapter11.ex02;
//Abstract : 추상적인

//만약 클래스 내의 메서드 중에서 하나라도 abstract 메서드가 존재한다면 그 클래스는 반드시 abstract class로 선언해야한다.

// abstract 메서드는 아직 기능을 정의하지 않은 메서드그럼 그 기능을 누가 언제 정의하는데???????
// 어떤 자식이 상속하면서 정의 해줘야 함.

abstract class Animal {
    abstract void cry(); // cry()를 완성시키지 않은 것은 아니다. 역할 : 아무것도 안하는거
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class AbstractModifer {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.cry();
        Animal dog = new Dog();
        dog.cry();
    }

}
