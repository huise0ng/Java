package ch02;

import java.lang.reflect.Array; //java -> lang -> reflect -> Array
import java.util.Arrays;

public class InitialValue {
    public static void main(String[] args) {
        //일반 변수나 배열은 초기화가 자동으로 되지 않는다(C언어에서는 0이나 쓰레기값이 자동으로 들어가는데...)
        int value1;
        int[] value2;
        //System.out.println(value1 + value2);

        int value3 = 0;
        System.out.println(value3);
        int[] value4 = null;
        System.out.println(value4);

        //new로 만든 배열의 실체들은 자동으로 초기화가 된다
        int[] array1 = new int[3]; //int 배열 초기값 = 0
        for (int i = 0; i < 3; i++)
            System.out.println(array1[i]);

        boolean[] array2 = new boolean[3]; //boolean 초기값 = false
        for(int i=0; i<3; i++)
            System.out.println(array2[i]);

        double[] array3 = new double[3]; //double 초기값 = 0.0
        for(int i=0; i<3; i++)
            System.out.println(array3[i]);

        String[] array4 = new String[3]; //String 기본값 = null (String은 참조변수)
        for(int i=0; i<3; i++)
            System.out.println(array4[i]);

        //배열을 한 줄에 예쁘게 출력하는 방법
        //Arrays 클래스 파일 안에 있는 toString() 메서드를 실행시킴.
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));


    }
}