
import java.io.Serializable;

public class P implements Serializable {
  private String name;
  private int age;

  // No-argument constructor
  public  P() {}

  // Getter method for name
  public String getName() {
      return name;
  }

  // Setter method for name
  public void setName(String name) {
      this.name = name;
  }

  // Getter method for age
  public int getAge() {
      return age;
  }

  // Setter method for age
  public void setAge(int age) {
      this.age = age;
  }
}
