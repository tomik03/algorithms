import java.util.Scanner;

public class CustomerArray {
    public static void main(String args[]) {
        int n, sum = 0, max, min;
        double average = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        n = s.nextInt();
        int a[] = new int[n];
        max = a[0];
        min = a[0];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum += a[i];
            average = (double) sum/a.length;
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
        System.out.println("Максимальное: " + max);
        System.out.println("Минимальное: " + min);
    }
}
