package lesson7;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        Matrix matrix2 = new Matrix();
        matrix.fillRandomMatrix();
        matrix2.fillRandomMatrix();
        matrix.sum(matrix2);
        matrix.print();
        System.out.println("Умножение на число");
        matrix2.multiply(2);
        matrix2.print();
    }

}


