package src.ex08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정수가 음수일 때의 예외
class MinusException extends Exception {
    public MinusException(String message) {
        super(message);
    }
}

// 정수가 100점을 초과할 때의 예외
class OverException extends Exception {
    public OverException(String message) {
        super(message);
    }
}

// A 클래스
class A {
    void checkScore(int score) throws MinusException, OverException {
        if (score < 0) {
            throw new MinusException("예외 발생: 음수값 입력");
        } else if (score > 100) {
            throw new OverException("예외 발생: 100점 초과");
        } else {
            System.out.println("정답이에용~: " + score);
        }
    }
}

public class UserExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        A a = new A();

        while (true) {
            try {
                System.out.print("점수를 입력하세요: 여기에용 ");
                int score = Integer.parseInt(reader.readLine());

                if (score == -1) {
                    break; // -1 입력시 종료
                }

                a.checkScore(score);
                
            } catch (MinusException | OverException e) {
                System.out.println(e.getMessage());
            }  catch (NumberFormatException e) {
                System.out.println("숫자가 아니니까 다시해라..");
            }
        }
    }

