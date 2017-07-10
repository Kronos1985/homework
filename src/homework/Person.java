package homework;

public class Person {
    String fullName = "Semenov";
    int age = 32;

    public Person() {
    }

    public Person(String name, int age) {
        this.fullName = name;
        this.age = age;
    }

    public void talk() {
        System.out.println(fullName + " ,которому " + age + " разговаривает");
    }

    public void move() {
        System.out.println(fullName + " ,которому " + age + " дваигается");
    }
}
