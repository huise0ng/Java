package src.chapter15.ex01;

// 비디어 실행 프로그램을 만들려고 한다. 
// 비디오 실행은 비디오 프레임(화면) 과 자막이 동시에 실행되어야 한다. 
// 그렇다면 하나의 프로그램을 프레임, 자막 두개의 쓰레드로 구현해야한다. 
// 먼저 쓰레드로 구현하지 않는 예사
// 사실 쓰레드를 안써도 될거같다.
//하지만 프로그램이 쓰레드를 안쓰면 무조건 1개의 코어가 일하게 된다. 
//그런데 쓰레드를 2개이상 만든다면 여러개의 코어한테 일을 시킬 수 있게 되어서
// 프로그램 속도가 훨신 향상된다.


public class NoThread {
    public static void main(String[] args) {
        int[] frame= {1, 2, 3, 4, 5};
        String[] suvtitle= {"하나", "둘", "셋", "넷", "다섯"};

        // 프레임 설정
        for(int i = 0; i<frame.length; i++){
            System.out.println("(비디오 프레임)" + frame[i]);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            
        }

        //자막 설정
        for(int i = 0; i<suvtitle.length; i++){
            System.out.println("(자막 번호)" + suvtitle[i]);
        }
    }
}

