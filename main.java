public class Main
{
    public static void main(String args[]) throws Exception {
        System.out.println("This is One Thread Program");

        Runnable r = new MultiThread();
        Thread[] t = new Thread[3];
        for ( int i = 0; i < 3; i++){
           t[i] = new Thread(r);
           t[i].start();
        }
    }
}

class MultiThread implements Runnable {
    public void run(){
      System.out.println(1);
    }
}
