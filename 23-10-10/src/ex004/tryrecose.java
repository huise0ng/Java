package src.ex004;

import java.io.IOException;

//finally{}는 맨 마지막에 반드시 마무리로 실행되어야 하는 문장이들ㄹ어감
//대표적으로 많이 쓰이는 형태는 리소스 반납 이다ㅏ.
//예를 들어 스트링 반납, 메모리 공간 반납.


import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;
public class tryrecose {
    public static void main(String[] args) {
        System.out.println("문자열 하나를 입력하시오.");
        // InputStreamReader isr1 = null;
        // isr1 = new InputStreamReader(System.in);
        // char input = 0;
        // try {
        //     input = (char)isr1.read();
        //     System.out.println("입력 글자: "+input);
        // }   catch (IOException e) {
        //     throw new RuntimeException(e);
        // }
        //  finally {
        //     //리소스 헤제 구문 (옛날 문법)
        //     if(isr1!=null) {
        //         try {
        //             isr1.close();
        //         } catch (IOException e) {
        //             throw new RuntimeException(e);
        //         }
        //     }
        //  }
         //위에서 내가 스ㅡ트림을 finally에서 한번 close를 해줬기 때문에
         //두번다시 스트림을 생성할 수 없다. 
         //요즘 문법 (리소스 자동 헤제)
         //try () 안에 자동으로 헤제하고 싶은 리소스를 적어 넣는다.
         try(InputStreamReader isr2 = new InputStreamReader(System.in);) {
            char input2 = (char)isr2.read();
            System.out.println("입력 글자:"+input2);
         }
         catch (IOException e) {
            e.printStackTrace(); // 예외 내용을 친절하게 프린트 해준다.
         }

    }
}
