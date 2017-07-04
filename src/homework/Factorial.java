package homework;

public class Factorial {
    public static void main(String[] args) {
        double d = Math.random();
        d = d * 10;
        int fakt = 1;
        d = (int) d;
        if (d == 0 || d == 1)
            System.out.println(d + "!  = " + fakt);
        else {
            for (int i = 2; i <= d; i++) {
                fakt = fakt * i;
            }
            System.out.println(d + "!  = " + fakt);
        }
    }
}
