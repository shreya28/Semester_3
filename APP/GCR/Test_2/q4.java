class Account extends Thread {
    public void run(){
        System.out.println(getName()+": Started");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(getName()+": Completed");
    }
}

class Transaction extends Thread {
    public void run(){
        System.out.println(getName()+": Started");
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(getName()+": Completed");
    }
}

class Notification extends Thread {
    public void run(){
        System.out.println(getName()+": Started");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e ){
            System.out.println(e);
        }
        System.out.println(getName()+": Completed");
    }
}

public class q4 {
    public static void main(String args[]) throws InterruptedException {
        Account a = new Account();
        Transaction t = new Transaction();
        Notification n = new Notification();

        a.setName("AccountVerification");
        t.setName("TransactionLogger");
        n.setName("NotificationService");

        a.start();
        t.start();
        n.start();

        a.join();
        t.join();
        n.join();

        System.out.println("Transaction Processing Completed");
    }
}
