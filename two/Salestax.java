import java.util.Scanner;

class Salestax {

	public static void main(String[] args) {
		
		System.out.printf("please enter the price: ");

		var input = new Scanner(System.in);

		double price = input.nextDouble();

		System.out.printf("\nplease enter the tax: ");

		//if java had pointers I would be derference typecasting pointers
		double tax = ((double)input.nextInt()) * 0.01;

		//System.out.printf("\nthe tax is: %.2f\n", tax);

		input.close();

		tax *= price;

		System.out.printf("\n the tax is: $%.2f", tax);
		System.out.printf("\n the total price is: $%.2f\n", (tax + price));


	}


}
