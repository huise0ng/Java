package ex01;

class Human {
    String name;
    int age;
    void eat() {
        System.out.println("먹었다.");
    };
    void sleep() {
        System.out.println("잤다.");
    };
}

class Student extends Human{
    int studentID;
    void goToSchoool() {
        System.out.println("등교했다.");
    };
}

class Worker {
    int studentID;
    void goToWork() {
        System.out.println("출근했다.");
    };
}

public class Inheritance {  
    public static void main(String[] args) {
        //Human 객체 생성
        Human h = new Human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        //Studunt 객체 생성
        Student s = new Student();
        s.name = "김민성";
        s.age = 16;
        s.studentID = 128;
        s.eat();
        s.sleep();
        s.goToSchoool();

        //Worker 객체 생성
        Student w = new Student();
        w.name = "김민성";
        w.age = 16;
        w.studentID = 128;
        w.eat();
        w.sleep();
        w.goToSchoool();
    }    
}
