import java.util.Scanner;

void main() {

    int i = 0, posNums = 0, negNums = 0, total = 0;

    var input = new Scanner(System.in);

    for(;;i++) {
        System.out.printf("please enter an integer (0 or non-integer to quit): ");

		//non int sets num to zero and breaks loop
		//still counts valid integers in total
		int num = input.hasNextInt() ? input.nextInt() : 0;

        if (num == 0) break;
        else if (num > 0) posNums++;
        else negNums++;

        total += num;

    }

    input.close();

	//no ints causes special message
	if (total == 0) System.out.printf("no integers were entered\n");

	//any amount of ints causes stats to be printed
	else {
		System.out.printf("Positive count: %d\n", posNums);
		System.out.printf("Negative count: %d\n", negNums);
		System.out.printf("Total: %d\n", total);
		System.out.printf("Average: %.2f\n", (double)total/i);
	}

}
