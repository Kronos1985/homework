package homework;

public class FactorialSecond {
    public static void main(String[] args) {
        int d = getNumber();
        int fakt = 1;
        if (d == 0 || d == 1)
            System.out.println(d + "!  = " + fakt);
        else {
            for (int i = 2; i <= d; i++) {
                fakt = fakt * i;
            }
            System.out.println(d + "!  = " + fakt);
        }
    }

    public static int getNumber() {
        double d = Math.random();
        d = d * 10;
        return (int) d;
    }
}