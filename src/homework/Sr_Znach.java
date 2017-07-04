package homework;

import java.util.Scanner;

public class Sr_Znach {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        double sum = 0.0;
        double srz, t;
        System.out.print("Введите кол-во чисел, для вычиследнея среднего значения: ");
        n = in.nextInt();
        System.out.println("Введите " + n + " числа.");
        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            t = in.nextDouble();
            sum += t;
        }
        srz = sum / n;
        System.out.println("Среднее значение: " + srz);
    }
}
