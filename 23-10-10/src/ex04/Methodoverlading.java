package ex04;

class Animal {
    void cry() {};
}

class Bird extends Animal {
    @Override
    void cry() {
        System.out.println("짹짹");
    }
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
public class Methodoverlading {
    public static void main(String[] args) {
        Animal aa new Animal();
        aa.cry();
        Animal Bird bb = new Bird();
        bb.cry();
        Animal Cat cc = new Cat();
        cc.cry();
        Animal Dog dd = new Dog();
        dd.cry();

        // 하나의 배열로 세개의 객체를 모두 관리하고 싶다.
        // 컴파일러가 Animal 클래스로 업캐스팅을 시켜줌.
        Animal[] animals = {bb, cc, dd};
        //each-for문으로 배열에 있는 모든 객체를 꺼낸당
        for(Animal animal: animals) {
            animal.cry();
        }
    }
}
