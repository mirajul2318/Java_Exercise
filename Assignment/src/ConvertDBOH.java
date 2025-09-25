public class ConvertDBOH {
    public static void main(String[] args) {
        int d = 97;
        String b = Integer.toBinaryString(d);
        String o = Integer.toOctalString(d);
        String h = Integer.toHexString(d);
        System.out.println(d);
        System.out.println(b);
        System.out.println(o);
        System.out.println(h);
    }
}
