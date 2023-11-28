package src.chapter14.ex07;
//사용자가 직접 만드는 예외
//ex) int age = -1; 실행하면 -> 예외가 발생하도록(내가 원한느 에외 메세지를 터미널창에 띄우기)

import javax.management.RuntimeErrorException;

class MyExeption extends Exception {
    // 1. 기본생성자
    public MyExeption() {
        super(); //부모 생성자를 함께 호출 (악셉션)
    }
    //2. 메개변수 생성자
    public MyExeption(String message) { // 메시지에는 내가 원하는 예외 메시지가 담긴다. (ex, 나이는 100세 초과 금지 등)
        super(message);
    }
}

class A{
    void abc_1(int num) throws MyExeption{
        if(num > 70)
            System.out.println("정상 작동");
        else 
                throw new MyExeption("숫자가 70보다 커야합니다.");
            
    }
    void bcd_1() {
        try {
            abc_1(65);
        } catch (MyExeption e) {
            throw new RuntimeException(e);
        }
        
    }
}





public class CrateUserExcepiton {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
    }
}
