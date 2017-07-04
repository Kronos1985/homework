package homework;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Vladimirov", 30);
        Person person2 = new Person();
        person2.move();
        person2.talk();
        System.out.println();
        System.out.println("Полные данные" + person1);
        System.out.println("Полные данные" + person2);


    }
}
