public class ComparableExample {
    static class Item implements Comparable<Item> {
        int price;

        Item(int price) {
            this.price = price;
        }

        public int compareTo(Item other) {
            return Integer.compare(this.price, other.price);
        }
    }

    public static void main(String[] args) {
        Item item1 = new Item(100);
        Item item2 = new Item(200);
        System.out.println("Compare: " + item1.compareTo(item2));
    }
}
