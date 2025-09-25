public class BookEx {
    static class Book {
        String title;

        Book setTitle(String title) {
            this.title = title;
            return this;
        }
    }

    public static void main(String[] args) {
        Book b = new Book().setTitle("Harry Potter");
        System.out.println("Book title: " + b.title);
    }
}
