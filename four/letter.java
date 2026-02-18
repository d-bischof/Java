import java.util.Scanner;


void main() {
	var input = new Scanner(System.in);

	System.out.printf("Enter a letter: ");
	String msg = input.next();

	char c;

	if (msg.length() != 1) {
		System.out.println();
		System.out.printf("invalid input: \"%s\" not a character\n", msg);
		return;
	}
	else {
		c = msg.charAt(0);
		if (!Character.isLetter(c)) {
			System.out.printf("invalide input: \"%c\" not a letter\n", c);
			return;
		}
	}

	System.out.println();

	char vowels[] = {'a', 'e', 'i', 'o', 'u'};

	int vowelState = 0; 

	for (int i = 0; i < vowels.length; i++) {
		if (Character.toLowerCase(c) == vowels[i]) vowelState = 1;
	}

	if(Character.toLowerCase(c) == 'y') vowelState = 2;

	switch (vowelState) {

		case 0:
			System.out.printf("your letter: \"%c\" is a consonant\n", c);
			break;

		case 1:
			System.out.printf("your letter: \"%c\" is a vowel\n", c);
			break;

		case 2:
			System.out.printf("your letter: \"%c\" is sometimes a vowel\n", c);
			break;

		default:
			System.out.printf("how did you do that?!?!?\n");

	}

}
