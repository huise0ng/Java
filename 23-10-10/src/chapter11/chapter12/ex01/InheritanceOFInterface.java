package chapter11.chapter12.ex01;


//클래스가 클래스를 구현하고 시픙면 extends 그리고, 클래스가 interface를 구현하고 싶으면 implement
interface A{}
interface B{}

class C implements A{}
class C implements A, B{}

// class C implements A{}
class D{}

//class E extends C, D{} //자바는 다중 상속 불가능 

//클래스 C도 상속하고 싶고 인터페이스 A, B도 다중 인터페이스 시키고 싶다..
class F extends C implements A,B
public class InheritanceOFInterface {
    
}
