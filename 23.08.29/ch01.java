package ch01;
//package 파일은 여러 관련된 클래스 파일들의 집합

public class ch01{

    public static void main(String[] args){
        //배열 1 (줄 바꿈 O)
        int[] array1 = new int[3];
        array1[0] = 3;
        array1[1] = 3;
        array1[2] = 4;
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

        int[] array2; //c에서는 배열의 크기조차 지정 안 하고 넘어가면 에러가 뜨지만, 자바에서는 바준다.
        array2 = new int[3];
        array2[0] = 5;
        array2[1] = 6;
        array2[2] = 7;
        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);

        //배열의 값 2 (줄 바꿈 O)
        int[] array3 = new int[] {0, 104,0413}; //요소의 갯수만큼 3칸짜리 배열이 만들어짐
        System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);

        int[] array4;
        array4 = new int[] {7,8,9};
        System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);

        //배열의 값 3 (줄 바꿈 XX)
        int[] array5 = {10,11,12}; //요소의 갯수만큼 3칸짜리 배열이 만들어짐
        System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);

//        int[] array6;
//        array6 = {20,21,22};
//          System.out.println(array6[0] + " " + array6[1] + " " + array6[2]);
    }
}