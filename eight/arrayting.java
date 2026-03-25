import java.util.Scanner;


void main() {

    var input = new Scanner(System.in);

    double matrix[][] = new double[3][4];

    for (int i = 0; i < matrix.length; i++) {

        System.out.printf("Row: %d enter four doubles: ", i);

        String parts[] = input.nextLine().split("\\s+");

        if (parts.length != 4) {
            System.out.printf("enter four doubles per line");
            break;
        }

        for (int j = 0; j < matrix[0].length; j++) {

            double num = 0.0;

            try {
                 num = Double.parseDouble(parts[j]);
            } catch (Exception e) {
                System.out.printf("wrong put double: %s", e.getMessage());
                return;
            }

            matrix[i][j] = num;

        }

    }

   for (var row : matrix) {
        for (var x : row) {

            System.out.printf("%.2f ", x);

        }

        System.out.println();
    }
   System.out.println();
    
    System.out.printf("sum of column 1: %.2f\n", sumColumn(matrix, 0));
    System.out.printf("sum of column 2: %.2f\n", sumColumn(matrix, 1));
    System.out.printf("sum of column 3: %.2f\n", sumColumn(matrix, 2));

}

public static double sumColumn(double[][] matrix, int j)
{
    double sum = 0.0;
    for (int i = 0; i < matrix.length; i++) {
        sum += matrix[i][j];
    }

    return sum;
}
