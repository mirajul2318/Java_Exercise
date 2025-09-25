public class StudentInfo{
    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Priyanto", 22);
        System.out.println("Name: " + s.name + "\n Age: " + s.age);
    }
}
