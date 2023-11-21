package src.ex005;

class A{
    void abc() {
        bcd();
    }
    void bcd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
//2. 호출한 놈으로 예외르 전가할 때 throws

class B{
    void abc() {
        try{
            bcd();
        }   catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThrowExseption {
    public static void main(String[] args) {
        //1. 내가 예외 문장을 가지고 있는 놈이 직접 트라이 캐치()
        class A{
    void abc() {
        bcd();
    }
    void bcd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
//2. 호출한 놈으로 예외르 전가할 때 throws

class B{
    void abc() {
        try{
            bcd();
        }   catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
        
}    
}
