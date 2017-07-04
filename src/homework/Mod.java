package homework;

import java.util.Scanner;

public class Mod {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = in.nextDouble();
        double z = a < 0 ? -a : a;
        System.out.println("Введите второе число");
        double b = in.nextDouble();
        double y = b < 0 ? -b : b;
        System.out.println("Введите третье число");
        double c = in.nextDouble();
        double x = c < 0 ? -c : c;
        double min = 0;
        if (z < y && z < x) {
            min = z;
        } else if (y < z && y < x) {
            min = y;
        } else if (x < z && x < y) {
            min = x;
        }
        System.out.println(min);
    }
}



