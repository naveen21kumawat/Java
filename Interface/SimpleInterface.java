
interface MyIntf{
      void sound();
}

class Myclass implements MyIntf{
  public void sound(){
    System.out.println("Make A Sound");
  }
}

public class SimpleInterface {
  public static void main(String[] args){
    Myclass ob = new Myclass();
    ob.sound();
  }
}
