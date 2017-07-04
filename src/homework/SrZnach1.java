package homework;

public class SrZnach1 {
    public static void main(String args[]) {
        double sum = 0, srz = 0;
        for (String m : args) {
            double d = Double.parseDouble(m);
            sum += d;
        }
        srz = sum / args.length;
        System.out.println("Среднее значение: " + srz);
    }
}
