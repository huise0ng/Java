package ch07;

public class FlexibleSizeArrayArgument {

    public static void main(String[] args) {
        // 매서드 오버로딩을 이용해서 동일한 이름의 메서드를 다양하게 호출
        method1(1, 2);
        method1(1, 2, 3);
        method1();

        method2("안녕은 영원한 헤어짐은 아니겠지요", "아님");
        method2("자고싶다.", "뭐래 버텨라");
        method2();
    }
    // 만약 1에서 100까지 다있다면 싹다해야한다고 이건아니지!!!!!!!ㅂ 아이고 화난다
    // 근데 어떤 개발자가 만들었데 그건 가변길이 배열 매개변수라는데...?? 대박대박대박

    public static void method1(int... array) {
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    // 가변길이 매개변수를 사용하는 method2
    public static void method2(String... strings) {
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
