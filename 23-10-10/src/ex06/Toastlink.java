package ex06;

class A {
    private int a=3;
    private int b =4;

    
}

public class Toastlink {
    public static void main(String[] args) {
        A a = new A();
        // hashCode값은 그 객체가 메모리에 머물러 있는 고유 위치 정보
        System.out.printf("%x \n", a.hashCode());
        //toString는 그 객체를 나타내는 대표적인 정보이다.
        // 그정보에 사실 상 필요 없는 해시코드가 들어가 있을 필요가 있나?
        System.out.println(a.toString());
    }
}
