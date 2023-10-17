package ex03;

// class A 는 부모가 없느 것 처럼 보이지만 자동으로 extends object가 붙으면서 최상위 클래스인 
// Object 의 자식이 된다. 
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

    @Override
    void abc() {
        System.out.println("A 클래스 것을 재정의 함");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        //작은 풍선만 만들고 작은 풍선을 가리키는 경우
        A aa = new A();
        // toString()는 Object 클래스로부터 상속 받은 메서드입니다.
        System.out.println(aa.toString());
        System.out.println(aa.m);
        aa.abc();

        // 크고 작은 풍선 둘다 만들고 작은 풍선을 가리키는 경우이당
        A bb = new B();
        System.out.println(bb.toString());
        System.out.println(bb.m);    
        bb.abc(); 
        // bb가 가리키는 작은 풍선안에 n이 없기 때문에 사용 불가...
        // System.out.println(bb.n);
        // A였던 bb를 B로 다운 캐스팅을 했당 즉 큰 풍선을 가리키는 것으로 바꿈.
        System.out.println(((B)bb).n);
        ((B)bb).bcd();
        //킄고 작은 풍선 둘 다 만들고 큰 풍선을 가리키는 경우
        B cc = new B();
        System.out.println(cc.m);
        System.out.println(cc.n);
        cc.abc();
        cc.bcd();


   }
}
