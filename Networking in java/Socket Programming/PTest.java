public class PTest {
  public static void main(String[] args) {
    // Creating an instance of Java Bean
    P person = new P();

    // Setting values using setters
    person.setName("John Doe");
    person.setAge(25);

    // Getting values using getters
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());
}
}

