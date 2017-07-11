package lesson8;

public class Recurs {
    public static void main(String[] args) {
        recurs(25, 50);
        recurs(60, 30);
    }

    public static void recurs(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            recurs(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            recurs(a - 1, b);
        } else {
            System.out.println(b);
        }
    }
}

