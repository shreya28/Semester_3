class Restaurant extends Thread {
    public void run(){
        System.out.println("ORD1001: "+getName()+" Started");
        try {
            Thread.sleep(500);
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("ORD1001: "+getName()+" Completed");
    }
}
class Payment extends Thread {
    public void run(){
        System.out.println("ORD1001: "+getName()+" Started");
        try {
            Thread.sleep(300);
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("ORD1001: "+getName()+" Completed");
    }
}
class Delivery extends Thread {
    public void run(){
        System.out.println("ORD1001: "+getName()+" Started");
        try {
            Thread.sleep(700);
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("ORD1001: "+getName()+" Completed");
    }
}

public class q3 {
    public static void main(String[] args) throws InterruptedException {
        Restaurant r = new Restaurant();
        Payment p = new Payment();
        Delivery d = new Delivery();

        r.setName("Restaurant Thread");
        p.setName("Payment Thread");
        d.setName("Delivery Thread");

        r.start();
        p.start();
        d.start();

        r.join();
        p.join();
        d.join();

        System.out.println("Order Processing Completed");
    }
}
