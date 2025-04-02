class MyThread1 extends Thread {
    @Override
    public void run() {
      int i = 0;
      while(i<2){
        System.out.println("i am thread First");
        i=i+1;
      }
    }
    
}
class MyThread2 extends Thread {
    @Override
    public void run() {
      int i =0;

      while(i<2){
        System.out.println("i am thread Second");
        i=i+1;
      }
    }
    
}

public class T1_MyThread {

    public static void main(String[] args) {
    MyThread1 ob1 = new MyThread1();
    MyThread2 ob2 = new MyThread2();
    ob1.start();
    ob2.start();
    }

}
