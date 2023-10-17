package ex06;


public class Toastlink {
    // 외부에서 m과 n을 직접적으로 접근하지 못하도록 방어적인 코드를 사용할 필요가 ㄷ있다. 
    private int m;
    private int n;
    // 간접적으로 메서드를 통해서 필드(데이터)에 접근하도록 코드를 짜야 안전한 코드이다. 
    // 필드에서 값을 가져오는 메서드 
    public int getM() {
        //안전한 사용자 인지 확인하는 코드
        return m;
    }
    // m 필드에 값을 저장하는 메서드 
    public int setM(int m) {
        this.m = m;
    }
    // N필드에서 값을 가져오는 메서드 
    public int getN() {
        //
        return n;
    }
    public int setN(int n) {
        this.n = n;
    }
    @Override
    public String toString( {
        return 
    })
    public static void main(String[] args) {
        
    }
    }
}
