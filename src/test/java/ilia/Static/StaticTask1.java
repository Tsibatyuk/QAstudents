package ilia.Static;

public class StaticTask1 {
    private static int userCount = 0;

    public StaticTask1(String userName) {
        this.userName = userName;
        userCount++;
    }

    private String userName;

    public void f()
    {
        System.out.println(userCount);
    }
    public void User(String userName) {
        this.userName = userName;
        userCount++;
    }

    public String getUserName() {
        return userName;
    }

    public static int getUserCount() {
        return userCount;
    }
}
    final class userCounterExample
    {
        public static void main(String[] args)
        {
            StaticTask1 user1 = new StaticTask1("Alice");

            System.out.println("Total user created: " + StaticTask1.getUserCount());

            StaticTask1 user2 = new StaticTask1("Angelina");

            System.out.println("Total user created: " + StaticTask1.getUserCount());


        }
    }

