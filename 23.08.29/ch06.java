package ch06;

import java.util.Arrays;

public class MethodsOfString {

    public static void main(String[] args){
        //대문자 -> 소문자, 소문자 -> 대문자
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        //문자열 안에 있는 내용을 바꿔주는 메소드
        System.out.println(str1.replace("Study", "공부"));

        //문자열 잘라주는 메소드 || (0, n) => 0, 1, ... n-2, n-1
        System.out.println(str1.substring(0, 8));

        //문자열을 구분자를 통해서 나누는 메소드
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));

        //문자열 앞 뒤 공백 제거
        System.out.println("       abc          ".trim());

        //문자열 내용 비교
        String str2 = new String(("JAVA"));
        String str3 = new String(("JAVA"));
        String str4 = new String(("java"));

        //객체(방)의 주소를 비교함 => 당연히 False
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str2 == str4);
        System.out.println();

        //객체의 주소가 아닌 안에 있는 내용을 비교하고 싶으면?
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        //대문자 소문자 무시하고 ONLY 내용만 비교
        System.out.println(str3.equalsIgnoreCase(str2));


    }
}