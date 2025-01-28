import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // random array size 10 (between 0 and 99)
        int[] randomArray = generateRandomArray(10, 100);

        // Test suite with random array and lloop
        TestSuite.run(randomArray, 1000);
    }

    // generating random array
    public static int[] generateRandomArray(int size, int maxValue) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue); // random values between 0 and maxval - 1
        }
        return array;
    }
}
