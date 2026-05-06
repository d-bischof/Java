class Rectangle extends GeometricObject {

    private double width = 1;
    private double height = 1;

    Rectangle() {}

    Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {

        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString()
             + "\nWidth: " + width
             + "\nHeight " + height
             + "\nArea: " + getArea()
             + "\nPerimeter: " + getPerimeter();
    }

}
