package ch04;

public class EffectOfPrimaryArgument {
    public static void main(String[] args) {
        int a = 3;
        int result1 = twice(3);
        System.out.println(result1);
        int result2 = twice(a);
        System.out.println(result2);
        System.out.println(a);

        // 다른 나라의 메서드에 잇는 a와 우리 메서드 a는 서로 다른 a이므로 바뀌지 않았다.
        // call by value : ex) 변수와 주소가 아닌 값만 딱 전달하는 에시

    }

    public static int twice(int a) {
        a = a * 2;
        return a;
    }
}
