import java.util.Scanner;

void main() {

	var input = new Scanner(System.in);

	System.out.printf("Please enter an amount of students: ");
	int len = input.hasNextInt()? input.nextInt() : 0;

	if (len <= 0) {

		System.out.printf("cant initalize array of length \"%d\"\n", len);
		input.close();
		return;

	}

	//bullshit heap allocated primitive array
	int grades[] = new int[len];

	for (int i = 0; i < len; i++) {

		System.out.printf("\nPlease enter grade #%d: ", i+1);	
		int grade = input.hasNextInt()? input.nextInt() : -1;

		if (grade <= -1 || grade > 100) {
			System.out.printf("not a valid grade");
			break;
		}

		grades[i] = grade;

	}

	input.close();

	int max = grades[0];

	for (int i = 1; i < len; i++) {
		if (grades[i] > max) max = grades[i];
	}

	char lookup[] = new char[101];
	
	for (int i = 0; i <= 100; i++) {
		if      (i >= max - 10) lookup[i] = 'A';
		else if (i >= max - 20) lookup[i] = 'B';
		else if (i >= max - 30) lookup[i] = 'C';
		else if (i >= max - 40) lookup[i] = 'D';
		else 					lookup[i] = 'F';

	}

	System.out.println();

	for (int i = 0; i < len; i++) {
		char grade = lookup[grades[i]];

		System.out.printf("Student %d score is %d%% and grade is %c\n", i+1, grades[i], grade);
	}
}
