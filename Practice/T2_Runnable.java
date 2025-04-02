
class Myrunnable1 implements Runnable {

    public void run() {
      int i = 0;
      while(i<=3){
         System.out.println("I am Run method First");
         i++;

       }
    }
}

class Myrunnable2 implements Runnable {

    public void run() {
      int i = 0;

      while( i <= 4){
          System.out.println("I am Run method Second and i want to become a software");
          i++;

        }
    }
}

public class T2_Runnable {

    public static void main(String[] args) {
      Myrunnable1 bullet1 = new Myrunnable1();
      Thread gun1 = new Thread(bullet1);
      Myrunnable2 bullet2 = new Myrunnable2();
      Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
