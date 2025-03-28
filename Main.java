// Define an abstract class
abstract class Animal {
    // Abstract method
    abstract void speak();

 
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal() {
            void speak() {
                System.out.println("This is an anonymous animal speaking.");
            }
        };
        myAnimal.speak(); // Output: This is an anonymous animal speaking.
    }
}