package homework;

public class Oblast {
    public static void main(String[] args) {
        System.out.println("Начало программы");
        String global = "Глобальные переменные";
        {
            String local = "Локальные переменные";
            {

                System.out.println("Локальные :");
                System.out.println("global = " + global);
                System.out.println("local = " + local);
            }
        }
        System.out.println();
        System.out.println("Глобальные :");
        System.out.println("global = " + global);
        System.out.println("Конец программы");
    }
}

