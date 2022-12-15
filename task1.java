import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 0;
        try {
            System.out.println("Введите размерность массива:");
            N = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число.");
            System.exit(1);
        }
        Double[] arr = new Double[N];
        Double[] newArr = new Double[N];
        Double sum = 0.0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < N; i++) {
            try {
                arr[i] = in.nextDouble();
                sum += arr[i];
                newArr[i] = sum / (i + 1);
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Элементы массива должны быть числами");
                System.exit(1);
            }

        }
        System.out.println("Исходный массив:" + Arrays.toString(arr));
        System.out.println("Массив после обработки:" + Arrays.toString(newArr));
    }
}
