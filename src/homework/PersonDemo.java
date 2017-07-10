package homework;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Vladimirov", 55);
        Person person2 = new Person();

        person1.talk();
        person2.talk();

        person1.move();
        person2.move();
    }
}




