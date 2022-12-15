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
        int[] arr = new int[N];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < N; i++) {
            try {
                arr[i] = in.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Ошибка. Массив и число к удалению должны быть целыми");
                System.exit(1);
            }

        }
        int X = 0;
        try {
            System.out.println("Число к удалению:");
            X = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка. Массив и число к удалению должны быть целыми");
            System.exit(1);
        }
        String s = String.valueOf((arr[0]));
        for(int i = 1; i < N; i++){
            s = (s + " " + arr[i]);
        }
        String[] array = s.replaceAll(String.valueOf(X), "").replaceAll("  ", " ").split(" ");
        int[] results = new int[array.length];
        System.out.println(array.length);
        for(int i = 0; i < array.length; i++) {
            results[i] = Integer.parseInt(array[i]);
        }
        System.out.println("Оригинальный массив:" + Arrays.toString(arr));
        System.out.println("Итоговый массив:" + Arrays.toString(results));
    }
}
