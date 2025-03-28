interface Cat{
  void sound();
}
class Animal implements Cat{
    public void sound(){
        System.out.println("Meow");
        }
        public void sound2(){
            System.out.println("Meow2");
            }

}
public class Interface {
    public static void main(String[] args) {
     Animal a = new Animal();
     a.sound();
     a.sound2(); // Error: sound2() has private access in Animal

    }
}
