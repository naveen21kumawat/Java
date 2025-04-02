
class Mythread1 extends Thread {

    @Override
    public void run() {
        int i = 0;
        while (i < 2) {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class Mythread2 extends Thread {

    int i = 0;

    @Override
    public void run() {
        while (i < 2) {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}

class MultiThred {

    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        String s =  t2.getName();
        System.out.println(s);
        t2.start();

    }
}
