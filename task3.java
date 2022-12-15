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
System.out.println("Введите элементы массива:");
for (int i = 0; i < N; i++) {
        try {
            arr[i] = in.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Ошибка. Элементы массива должны быть числами");
            System.exit(1);
        }

    }
    String s = String.valueOf((arr[0]));
    double k = arr[0];
for(int i = 1; i < N; i++){
        if(k <= arr[i]) {
            s = (s + " " + arr[i]);
            k = arr[i];
        }
    }
    String[] array = s.split(" ");
    Double[] results = new Double[array.length];
for(int i = 0; i < array.length; i++) {
        results[i] = Double.parseDouble(array[i]);
    }
System.out.println("Исходный массив:" + Arrays.toString(arr));
System.out.println("Массив после обработки:" + Arrays.toString(results));

    }
}
