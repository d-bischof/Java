
void main() {

    var x = new MyInteger(5);
    var y = new MyInteger(5);

    System.out.printf("Value: %d\n", x.getValue());
    System.out.printf("Is even: %b\n", x.isEven());
    System.out.printf("Is odd: %b\n", x.isOdd());
    System.out.printf("Is even (static): %b\n", MyInteger.isEven(x));
    System.out.printf("Is odd (static): %b\n", MyInteger.isOdd(x)); 
    System.out.printf("Equals (object): %b\n", x.equals(y));
    System.out.printf("Equals (primitive): %b\n", x.equals(5));

}