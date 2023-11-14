package chapter13.ex01;
// Button 클래스 안에는 onClick()과 같은 메서드가 존재한다.
// onClick을 실행했을 때 어떤 동작을 실행할 것인지는 때에 따라 다른다.
// 귀를 기울이고 있다가(이벤트 리스너) 누군가가 setOnClick 리스너를 호출 했을 때 ㄴ
//onClick() 메서드의 역할이 확시히 정해지게 된다. 누군가가 정의한 오버라이딩대로 실행된다.
class Button {
    onClickListener ocl;
    void setOnClickListener(onClickListener ocl) {//onclickListener 인터페이스를 외부에서 받아와서 짚어 넣겠다. 
        this.ocl = ocl;
    }

    interface onClickListener {
        void onClick();
    }
}

void onClick() {
    ocl.onClick();
}



public class ButtonApiexample {
    public static void main(String[] args) {
        //첫번째 예시 : 클릭하면 음악재생으로 오버라이딩
        Button btn1 = new Button(); // 첫번째 버튼 객체 생성
        //빈껍데기를 인터페이스) 를 뉴해서 바로 줄수는 없다.
        //빈껍데기를 구현한 임플리멘트 어떤 자식클래스를 뉴로 넘겨주거나 
        //아니면 빈껍데기를 넘겨줄 때 중괄호 안에 동시에 구현시키면 (오버라이딩) 가능하다. 
        btn1.setOnClickListener(new Button.onClickListener() {
            @Override
            public void onClick() {
                System.out.println("음악 재생 중");
            }
        });
        btn1.onClick();
    }

    public class ButtonApiexample {
    public static void main(String[] args) {
        //첫번째 예시 : 클릭하면 음악재생으로 오버라이딩
        Button btn1 = new Button(); // 첫번째 버튼 객체 생성
        //빈껍데기를 인터페이스) 를 뉴해서 바로 줄수는 없다.
        //빈껍데기를 구현한 임플리멘트 어떤 자식클래스를 뉴로 넘겨주거나 
        //아니면 빈껍데기를 넘겨줄 때 중괄호 안에 동시에 구현시키면 (오버라이딩) 가능하다. 
        btn1.setOnClickListener(new Button.onClickListener() {
            @Override
            public void onClick() {
                System.out.println("start naver");
            }
        });
        btn1.onClick();
    }
}
