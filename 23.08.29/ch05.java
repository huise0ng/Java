package ch05;

public class CreateStringObject {

    public static void main(String[] args){
        /*new~ 키워드
        배열의 경우 배열의 실제 '방'을 만드는 명령어이다.
        이처럼 new~로 만든 실제 '방'을 우리는 '객체'라고 부른다*/

        //String 객체 생성 1
        //배열을 제외하고 제일 앞 글자가 대문자로 시작하는 자료형은 모두 참조변수 자료형이다. (클래스)
        //new 객체를 만들었고 그 객체의 주소가 str1에 담긴다. 왜? str1이 참조 변수라서
        //String이라는 클래스로 만든 변수는 전부 창조 변수이다.
        String str1 = new String("안녕");
        System.out.println(str1);

        //String 객체 생성 2
        //new 키워드 생략 가능 (객체가 안 만들어지는 것은 아님)
        String str2 = "안녕하세요";
        System.out.println(str2);


    }
}