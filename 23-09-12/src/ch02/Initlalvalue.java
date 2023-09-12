package ch02;

class A {
    // 다양한 필드 정의
    boolean m1;
    int m2;
    double m3;
    String m4;

    // 초기화 안 싴킨 필드들을 출력해주는 메서드
    void printFieldValue() {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

    void printLocalVariable() {
        // 이 친구는 필드가 아니라 지역변수이다.
        int k = 10;
        System.out.println(k);
    }
}

public class Initlalvalue {
    public static void main(String[] args) {
        A a = new A();
        a.printFieldValue();
        // 어머나 출력이 잘되넹ㅎㅎ
        // 아하 필든느 컴파일러가 자동으로 초기화 시켜주는구나 아하!!!!! ㅎㅎㅎㅎ
        a.printLocalVariable();
        // 지역 변수는 출력이 안되네 ㅠㅠㅠㅜㅜㅜㅜㅜ
        // 아하 지역변수는 필드와 다르게 초기화를 반드시 시켜줘야 하는구낭
    }

}
