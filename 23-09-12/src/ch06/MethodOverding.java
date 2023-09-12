package ch06;

public class MethodOverding {

    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println("데이터가 엄습니당당면");
    }

    public static void print(int a) {
        System.out.println("1234");
    }

    public static void print(double a) {
        System.out.println("5678");
    }

    // 바로 위의 메서드 시그니처가 똑같기 때문에 정의할 수 없다. 없데 없다자나..
    // public static void print(double a) {
    // System.out.println("5678");
    // }

    // 매서드 시그니처가 다르다는 것은 이름은 똑같지만 매개변수의 종류나 숫자가 다름을 의미
    // 반환점이 다르다는 것은 호출할 대 해깔리기 때문에 시그니처가 같다라고 할 수 있닷.
}
