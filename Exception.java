
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 20;
        arr[1] = 20;
        arr[2] = 20;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index of the array you want to access: ");
        int ind = sc.nextInt();

        try {
            System.out.println("The Value At Index " + ind + " is: " + arr[ind]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Some Exception Occured:");
        }

    }
}
