package homework;

import java.util.Scanner;

public class SummSecond {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число");
        Scanner scn1 = new Scanner(System.in);
        int i = getNumber(scn1);
        System.out.println("Введите второе целое число");
        int k = getNumber(scn1);
        int sum = i + k;
        System.out.println("Сумма = " + sum);
    }

    public static int getNumber(Scanner scn1) {
        int a = 0;
        if (scn1.hasNextInt()) {
            a = scn1.nextInt();
        } else {
            System.out.println("Ошибка. Вы ввели не целое число");
        }
        return a;
    }
}

