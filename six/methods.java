import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

static void sortArr(ArrayList<Double> arr) {

    Collections.sort(arr);
    System.out.println();

    System.out.printf("Sorted Array:\t");
    System.out.println(arr);

}

static int Sumdigits(long n) {

    long sum = 0;
    long remainder = 0;

    while (n != 0) {
        remainder = n % 10;
        sum += remainder;
        n /= 10;

    }

    return (int)sum;
}

void main() {

    var input = new Scanner(System.in);

    int i = 0;

    double num = 0.0;

    ArrayList<Double> array = new ArrayList<>();

    for(;;i++) {
        System.out.printf("Please enter a double (enter non-double when finished): ");

        num = input.hasNextDouble() ? input.nextDouble() : 0.0;

        if (num == 0.0) break;

        array.add(num);
    
    }

    System.out.printf("\nPlease enter a long to find sum of digits: ");

    long n = 0;

    input.next();

    if (input.hasNextLong()) n = input.nextLong();
    else System.out.printf("\nnot a valid long");

    input.close();

    sortArr(array);

    System.out.printf("Sum of digits for \"%d\": ", n);
    System.out.printf("  %d", Sumdigits(n));

}