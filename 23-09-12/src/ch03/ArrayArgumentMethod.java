package ch03;

import java.util.Arrays;

public class ArrayArgumentMethod {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3 };
        printArray(array);
        printArray(new int[] { 4, 5, 6 });
        // new로 객체를 안만들고 바로 값을 전달하는 것은 불가능하다.

        // printArray({7,8,9})
        // 아래는 한줄에 다 적었으므로 컴파일러가 new를 자동으로 넣어준다.
        int[] array2 = { 10, 11, 12 };
        printArray(array2);
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}