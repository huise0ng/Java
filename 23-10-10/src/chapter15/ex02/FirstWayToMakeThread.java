package src.chapter15.ex02;
// 자막을 출력하는 쓰레드
class SMIFlieThread extends Thread {
    @Override
    public void run() {
        //내가 넣고자 하는 자막에 흐름을 적어넣자.
        String[] subtitle ={"하나", "둘", "셋", "넷", "다섯"};

        for(int i = 0; i<subtitle.length; i++) {
            System.out.println(" - (자막번호)" + subtitle[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//비디오 프레임을 출력하는 쓰레드
class VideoFileThread extends Thread {
    @Override
    public void run() {
        int[] frame = {1, 2, 3, 4, 5};

        for(int i = 0; i<frame.length; i++) {
            System.out.println("(비디오 프레임)" + frame[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            
        }
    }
}



public class FirstWayToMakeThread {
    public static void main(String[] args) {
        // 두개의 쓰레드를 객체 생성해서 동시에 실행 시키는 방법
        //쓰레드 객체를 실행하는 방법
        Thread VideoFlieThread = new VideoFileThread();
        videoFileThread.start();

        // 쓰레드 객체를 생성
        Thread smiFileThread = new SMIFlieThread();
        // 생성된 객체로 쓰레드를 실행
        smiFileThread.start();
    }
}
