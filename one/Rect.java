
public class Rect {

	public static void main(String[] args) {

		// is this java const equvilant?!??!
		final float WIDTH = 4.5f;
		final float HEIGHT = 7.9f;

		//why should I use println when C printf is available 
		System.out.printf("Area: %.1f\n", WIDTH * HEIGHT);
		System.out.printf("Perimeter: %.1f\n", 2 * (WIDTH + HEIGHT));
	}
}
