package ch04;

import java.util.Arrays;

public class ReadArray {
    public static void main(String[] args){
        int[] array = {3,4,5,6};

        //출력 1
        System.out.println(array[0] + " ");
        System.out.println(array[1] + " ");
        System.out.println(array[2] + " ");
        System.out.println(array[3]);
        System.out.println();

        //출력 2
        //for문 단점 : 배열의 길이가 달라지면 일일이 수정을 해야함
        //.length
        for(int i=0; i<array.length; i++)
            System.out.println(array[i] + " ");
        System.out.println();

        //출력 3 each-for문 활용
        for(int k : array)
            System.out.println(k + " ");
        System.out.println();

        //출력 4
        System.out.println(Arrays.toString(array));
    }
}