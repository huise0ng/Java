package ch05; // ch05 패키지에 속하는 클래스를 선언합니다.

import java.util.Arrays; // 배열을 문자열로 변환하기 위해 java.util.Arrays 클래스를 가져옵니다.

public class EffectOfReferenceArgument { // EffectOfReferenceArgument 클래스를 정의합니다.

    public static void main(String[] args) { // 프로그램의 시작점인 main 메서드를 정의합니다. 매개변수로 문자열 배열 args를 받습니다.
        int[] a = new int[] { 1, 2, 3 }; // 크기가 3인 int형 배열 a를 생성하고, 값이 1, 2, 3으로 초기화합니다.
        System.out.println(Arrays.toString(a)); // 배열 a를 문자열로 변환하여 출력합니다.
        twice(a); // twice 메서드에 배열 a를 전달하여 호출합니다.
        System.out.println(Arrays.toString(a)); // 변경된 배열 a를 다시 문자열로 변환하여 출력합니다.
        // call by reference 예시: 값을 전달한게 아니라 주소를 전달했기 대문
        // main 메서드의 a와 twice 메서드의 a는 값은 배열이르로 값이 바뀐다.
    }

    public static void twice(int[] a) { // twice 메서드를 정의합니다. 매개변수로 int형 배열 a를 받습니다.
        for (int i = 0; i < a.length; i++) { // 배열의 길이만큼 반복문을 실행합니다.
            a[i] = a[i] * 2; // 각 요소 값을 두 배로 업데이트 합니다.
        }
    }
}
