public class UserCloneExample {
    static class User {
        String username;

        User(String username) {
            this.username = username;
        }

        User cloneUser() {
            return new User(this.username);
        }
    }

    public static void main(String[] args) {
        User u1 = new User("user123");
        User u2 = u1.cloneUser();
        System.out.println("Cloned User: " + u2.username);
    }
}
