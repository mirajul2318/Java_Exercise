public class Pattern01 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][];
        numbers[0] = new int[1];
        numbers[1] = new int[2];
        numbers[2] = new int[3];
        numbers[3] = new int[4];
        int k=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println("");
        }
    }
}
