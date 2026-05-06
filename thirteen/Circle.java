class Circle extends GeometricObject {

    private double radius = 1;

    Circle() {}

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return super.toString()
             + "\nRadius: " + radius
             + "\nDiameter: " + getDiameter()
             + "\nArea: " + getArea()
             + "\nPerimeter: " + getPerimeter();
    }
}
