class ResizeThread extends Thread {
    public void run(){
        System.out.println("ResizeThread - Started");
        try {
            Thread.sleep(300);
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("ResizeThread - Completed");
    }
}
class GrayScaleThread extends Thread {
    public void run(){
        System.out.println("GrayScaleThread - Started");
        
        try {
            Thread.sleep(500);
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("GrayScaleThread - Completed");
    }
}
class CompressionThread extends Thread {
    public void run(){
        System.out.println("CompressionThread - Started");
        try {
            Thread.sleep(400);
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("CompressionThread - Completed");
    }
}
public class q2 {
    public static void main(String[] args) throws InterruptedException {
        ResizeThread r = new ResizeThread();
        GrayScaleThread g = new GrayScaleThread();
        CompressionThread c = new CompressionThread();
        r.start();
        g.start();
        c.start();

        r.join();
        g.join();
        c.join();
        System.out.println("Image Processing Completed");
    }
}
