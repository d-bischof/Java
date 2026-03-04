import java.util.Scanner;

void main() {

    int i = 0, posNums = 0, negNums = 0, total = 0;

    var input = new Scanner(System.in);

    for(;;i++) {
        System.out.printf("please enter a numebr (0 to quit): ");

        int num = input.nextInt();

        if (num == 0) break;
        else if (num > 0) posNums++;
        else negNums++;

        total += num;

    }

    System.out.printf("Positive count: %d\n", posNums);
    System.out.printf("Negative count: %d\n", negNums);
    System.out.printf("Total: %d\n", total);
    System.out.printf("Average: %.2f", (double)total/i);

    input.close();


}