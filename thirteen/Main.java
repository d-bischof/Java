import java.util.Scanner;

public class Main {

    void run() {
        Scanner input = new Scanner(System.in);

        try {
            // Prompt for rectangle data and create the rectangle object.
            System.out.print("Enter rectangle length: ");
            double rectLength = Double.parseDouble(input.nextLine().trim());

            System.out.print("Enter rectangle width: ");
            double rectWidth = Double.parseDouble(input.nextLine().trim());

            System.out.print("Enter rectangle color: ");
            String rectColor = input.nextLine().trim();

            System.out.print("Is the rectangle filled? (true/false): ");
            boolean rectFilled = Boolean.parseBoolean(input.nextLine().trim());

            Rectangle rectangle = new Rectangle(rectLength, rectWidth, rectColor, rectFilled);

            // Prompt for circle data and create the circle object.
            System.out.print("Enter circle radius: ");
            double circleRadius = Double.parseDouble(input.nextLine().trim());

            System.out.print("Enter circle color: ");
            String circleColor = input.nextLine().trim();

            System.out.print("Is the circle filled? (true/false): ");
            boolean circleFilled = Boolean.parseBoolean(input.nextLine().trim());

            Circle circle = new Circle(circleRadius, circleColor, circleFilled);

            // Prompt for triangle data and create the triangle object.
            System.out.print("Enter triangle side 1: ");
            double side1 = Double.parseDouble(input.nextLine().trim());

            System.out.print("Enter triangle side 2: ");
            double side2 = Double.parseDouble(input.nextLine().trim());

            System.out.print("Enter triangle side 3: ");
            double side3 = Double.parseDouble(input.nextLine().trim());

            System.out.print("Enter triangle color: ");
            String triangleColor = input.nextLine().trim();

            System.out.print("Is the triangle filled? (true/false): ");
            boolean triangleFilled = Boolean.parseBoolean(input.nextLine().trim());

            if (!isValidTriangle(side1, side2, side3)) {
                throw new IllegalArgumentException("The three sides do not form a valid triangle.");
            }

            Triangle triangle = new Triangle(side1, side2, side3, triangleColor, triangleFilled);

            // Display the requested information for each shape using the object's existing toString method.
            System.out.println("Rectangle information:");
            System.out.println(rectangle);
            System.out.println();
            System.out.println("Circle information:");
            System.out.println(circle);
            System.out.println();
            System.out.println("Triangle information:");
            System.out.println(triangle);

            // Use GeometricObject references for comparison methods.
            GeometricObject geoRectangle = rectangle;
            GeometricObject geoCircle = circle;
            GeometricObject geoTriangle = triangle;

            System.out.println();
            compareArea(geoRectangle, geoCircle);
            comparePerimeter(geoRectangle, geoCircle);
            comparePerimeter(geoRectangle, geoTriangle);
            comparePerimeter(geoCircle, geoTriangle);
        }
        catch (NumberFormatException e) {
            // Input parsing failed because the user entered text that could not be converted to a number.
            System.out.println("Input error: please enter numeric values for lengths, widths, radii, and triangle sides.");
        }
        catch (IllegalArgumentException e) {
            // The triangle side lengths were invalid, or another argument was not acceptable.
            System.out.println("Invalid input: " + e.getMessage());
        }
        finally {
            input.close();
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    private boolean isValidTriangle(double s1, double s2, double s3) {
        return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
    }


    private void compareArea(GeometricObject first, GeometricObject second) {
        if (!(first instanceof Rectangle) || !(second instanceof Circle)) {
            System.out.println("Area comparison must be between a rectangle and a circle.");
            return;
        }

        double firstArea = ((Rectangle) first).getArea();
        double secondArea = ((Circle) second).getArea();

        if (Double.compare(firstArea, secondArea) == 0) {
            System.out.println("The rectangle and circle have equal area.");
        }
        else {
            System.out.println("The rectangle and circle do not have equal area.");
        }
    }

    private void comparePerimeter(GeometricObject first, GeometricObject second) {
        double firstPerimeter = getPerimeter(first);
        double secondPerimeter = getPerimeter(second);

        String firstName = first.getClass().getSimpleName();
        String secondName = second.getClass().getSimpleName();

        if (Double.compare(firstPerimeter, secondPerimeter) == 0) {
            System.out.println("The " + firstName + " and " + secondName + " have equal perimeter.");
        }
        else {
            System.out.println("The " + firstName + " and " + secondName + " do not have equal perimeter.");
        }
    }

    private double getPerimeter(GeometricObject object) {
        if (object instanceof Rectangle) {
            return ((Rectangle) object).getPerimeter();
        }
        if (object instanceof Circle) {
            return ((Circle) object).getPerimeter();
        }
        if (object instanceof Triangle) {
            return ((Triangle) object).getPerimeter();
        }
        throw new IllegalArgumentException("Unsupported geometric object for perimeter comparison.");
    }
}