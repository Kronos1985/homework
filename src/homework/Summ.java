package homework;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число");
        Scanner scn1 = new Scanner(System.in);
        if (scn1.hasNextInt()) {
            int i = scn1.nextInt();
            System.out.println("Введите второе целое число");
            if (scn1.hasNextInt()) {
                int k = scn1.nextInt();
                int sum = i + k;
                System.out.println("Сумма = " + sum);
            } else System.out.println("Ошибка. Вы ввели не целое число");
        } else System.out.println("Ошибка. Вы ввели не целое число");
    }
}
