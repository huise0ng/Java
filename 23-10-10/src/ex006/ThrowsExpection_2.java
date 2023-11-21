package src.ex006;

class A{
    void abc() {
        try {
            bcd();
            // 두 개의 catch는 합치는 것이 좋다. 
    } catch (ClassNotFoundException | InterruptedException e) {
        throw new RuntimeException(e);
    }
}
    void bcd() throws ClassNotFoundException, InterruptedException {
        Class cls = Class.forName("java.lang.Object");
        Thread.sleep(1000);
    }
        
        

public class ThrowsExpection_2 {
    
}
}