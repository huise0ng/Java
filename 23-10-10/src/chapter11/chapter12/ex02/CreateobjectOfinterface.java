package chapter11.chapter12.ex02;

interface A{
    int a = 3;
    void abc();  //추상메서드 중괄호는 선넘은 
}
// 만약 클래스 B를 정의하는게 귀찮다면 ?
//B정의 안하고 바로 new 객체 만들 수는 없나?

// class B implements A{
//     @Override
//     public void abc() {
//         System.out.println("B가 책임지고 오버라이딩 했다. ");
//     }
// }
public class CreateobjectOfinterface {
    public static void main(String[] args) {
        //A a1 = new A(); //인터페이스는 곧바로 new해서 객체를 생성할 수 없다. 
        //구체적인 친구만 new해서 객체를 생성할 수 있다. 
        A a1 = new A() {
            @Override
            public void abc() {
                System.out.println("rㅓ아러아어라" + "여기서 오버라이딩 가능 ");
            }
        }
        System.out.println(a1.a);
        a1.abc();
    }
    
}
