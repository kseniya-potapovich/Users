public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User(1, new Computer("Asus"));
        User user2 = (User) user1.clone();

        System.out.println(user1);
        System.out.println(user2);

        user2.getComputer().setModel("Mac");

        System.out.println(user1);
        System.out.println(user2);

        User user3 = (User) user2.cloneGlobal();
        user3.getComputer().setModel("Hp");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
