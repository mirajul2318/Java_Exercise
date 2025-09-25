public class PersonExample {
    static class Person {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Priyanto");
        p.setAge(22);
        p.display();
    }
}
