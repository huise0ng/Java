package src.chapter14.ex01;

//예외처리 하는 방법 try-catch-finally 구문을 활용
//트라이{} 예외가 발생할 가능성있는 구문들을 적는 곳
//catch{} : try에서 실제로 예외가 발생했다면 실행되는 차선책들이 적하는 곳
//finally{} : try와 catch에서 공통적으로 실행되는 문장을 적어 놓는 곳 , 리소스들을 반납할 때 쓰인다. 
//차선책이 뭐양? 해당 예외에 적절한 클래스들을 적어주는 것 
public class Excepation {
    public static void main(String[] args) {
        try {
        System.out.println(3/0);
    }
    catch (ArithmeticException e) {
        System.out.println("숫자는 0으로 나눌 수 없습니다. ");
    }
    finally {
        System.out.println("프로그램 종료");
    }
    //파스인투는 문자열을 숫자로 변경시켜준다. 
    NumberFormatException {
        
    }
    // int num = Integer.parseInt("10A");
    //     System.out.println(num);

    }
}
