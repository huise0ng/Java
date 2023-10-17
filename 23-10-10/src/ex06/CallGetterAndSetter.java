package ex06;


public class CallGetterAndSetter {
    public static void main(String[] args) {
        ToString a = new ToString();
        //m을직접적으로 접근이 불간으 하다. 반드시 get or set을 통해서 접근해야한다. 
        a.setM(4);
        System.out.println(a.getM());
        //System.out.println(a.m);

        a.setN(5);
        System.out.println(a.getN());
    }
        System.out.println(a.toString());
