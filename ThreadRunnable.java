class MyRunnable1 implements Runnable{
  public void run(){
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
    System.out.println("This Is a Thread 1 Not a Thrad 2");
  }
}
class MyRunnable2 implements Runnable{
  public void run(){
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
    System.out.println("This Is a Thread 2 Not a Thrad 1");
  }
}
class ThreadRunnable{
  public static void main(String[ ] args)
{
  MyRunnable1 bullate1 = new MyRunnable1();
  MyRunnable2 bullate2 = new MyRunnable2();
 Thread gun1 = new Thread(bullate1);
 Thread gun2 =new  Thread(bullate2);
 gun1.start();
 gun2.start();

  
}}