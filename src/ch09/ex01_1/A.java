package src.ch09.ex01_1;

//필드와 메서드 앞에 올 수 있는 4가지 접근 지정자
public class A {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    // 아하 프라이버트라고 되어있으면 같은 클래스 파일 안에서만 사용가능하구낭 ㅎㅎ
    // 같은 패키지 안에 다른 클래스에서 사용 불가능
    private int d = 4;

    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        // 아하 프라이버트라고 되어있으면 같은 클래스 파일 안에서만 사용가능하구낭 ㅎㅎ
        // 같은 패키지 안에 다른 클래스에서 사용 불가능
        // System.out.println(d + " ");
    }
}
