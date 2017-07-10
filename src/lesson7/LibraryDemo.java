package lesson7;

public class LibraryDemo {
    public static void main(String[] args) {
        Library user1 = new Library();
        Library user2 = new Library();

        user1.setName("Семёнов");
        user1.setAge(32);
        user1.setBirth("02.05.1985");
        user1.setFaculty("АСУ");
        user1.setPhoneNumber("+38-067-111-11-11");
        user1.setReaderNumber(3366);
        System.out.println();

        user2.setName("Владимиров");
        user2.setAge(31);
        user2.setBirth("15.05.1986");
        user2.setFaculty("ФК");
        user2.setPhoneNumber("+38-067-222-22-22");
        user2.setReaderNumber(6633);
        System.out.println();

        user1.takeBook("Программирование на JAVA");
        user1.returnBook("Программирование на с++");
        System.out.println();

        user2.takeBook("Экономика Предприятия");
        user2.returnBook("Финансы и Кредит");
        System.out.println();

        user1.info();
        System.out.println();
        user2.info();
    }
}

