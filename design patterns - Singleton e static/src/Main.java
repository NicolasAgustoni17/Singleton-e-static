public class Main {
    public static void main(String[] args) {

        User user1 = new User("Alice", 25);

        System.out.println("Informazioni del primo utente:");
        user1.printInfo();
        System.out.println();

        User user2 = new User("Bob", 30);
        user2.setAge(32);

        System.out.println("Informazioni del secondo utente:");
        user2.printInfo();
    }
}