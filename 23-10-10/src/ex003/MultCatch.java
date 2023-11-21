package src.ex003;

import java.text.spi.NumberFormatProvider;

public class MultCatch {
    public static void main(String[] args) {
//         try {
//             System.out.println(3/0);
            
//         }
//         catch (ArithmeticException e) {
//             System.out.println("숫자를 0으로 나눌 수 없습니다.");
            
//         }
//         finally {
//             System.out.println("프로그램 종료");
//         }

//         //Integer.parseInt() : ()안에 있는 문자를 숫자로 변화시켜 줌
//         try {
//             int num = Integer.parseInt("10"); //이것도 실수 할 수 있는 예외 문장이다.
//             System.out.println(num);
//         }
//         catch (NumberFormatException e ){
//             System.out.println("숫자로 바꿀 수 없습니다.");
//         }
    System.out.println(3/0);
     int num = Integer.parseInt("10"); //이것도 실수 할 수 있는 예외 문장이다.
/    System.out.println(num);

    }
}
