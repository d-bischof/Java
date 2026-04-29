/**
 * ArrayBounds.java
 * COP 2250 - Assignment 12
 * Exception Handling (Liang 12.3)
 *
 * Name:
 * Date:
 */
import java.util.Scanner;
import java.util.Random;

public class ArrayBounds {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var random = new Random();

        int data[] = new int[100];

        for (int i = 0; i < 100; i++) {
            data[i] = random.nextInt();
        }

        for(;;) {
            System.out.printf("please enter an integer (-1 or non-integer to quit): ");

            int num = input.hasNextInt() ? input.nextInt() : -1;

            try {
                System.out.printf("data[%d] = %d\n", num, data[num]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("Error: %s\n", e.getMessage());
            } 

            if (num == -1) break;

        }

        System.out.println("Goodbye.");
        input.close();
    }
}
