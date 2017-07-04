package homework;

public class Person {
    String fullName = "Semenov";
    int age = 20;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public void move() {
        System.out.println("Движение");
    }

    public void talk() {
        System.out.println("Рассказывай");
    }
}
