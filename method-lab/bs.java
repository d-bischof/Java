import java.util.Arrays;

static void sortArr(double[] arr) {

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
        System.out.printf("%.2f, ", arr[i]);
    }

}

static int Sumdigits(long n) {

    long sum = 0;
    long remainder = 0;

    while (n != 0) {
        remainder = n % 10;
        sum += remainder;
        n /= 10;

    }

    return (int)sum;
}

void main() {

    double[] array = {1.9, 1.0, 3.1, 10.1, 5.6, 7.1};

    sortArr(array);

    long n = 314235;

    System.out.printf("\n%d", Sumdigits(n));

}