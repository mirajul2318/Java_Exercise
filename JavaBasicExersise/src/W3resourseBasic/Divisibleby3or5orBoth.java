package W3resourseBasic;

public class Divisibleby3or5orBoth {
    public static void main(String[] args) {
        StringBuilder div3 = new StringBuilder();
        StringBuilder div5 = new StringBuilder();
        StringBuilder div3And5 = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                div3And5.append(i).append(", ");
            }  if (i % 3 == 0) {
                div3.append(i).append(", ");
            }  if (i % 5 == 0) {
                div5.append(i).append(", ");
            }
        }

        System.out.println("Divided by 3:");
        System.out.println(div3.toString());

        System.out.println("\nDivided by 5:");
        System.out.println(div5.toString());

        System.out.println("\nDivided by 3 & 5:");
        System.out.println(div3And5.toString());
    }
}
