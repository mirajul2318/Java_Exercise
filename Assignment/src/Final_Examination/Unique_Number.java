package Final_Examination;

public class Unique_Number {
    public static void main(String[] args) {
        int count = 0;
        for(int i= 1;i<=5;i++){
            for(int j= 1;j<=5;j++){
                for(int k= 1;k<=5;k++){
                    for(int l= 1;l<=5;l++){
                        for(int m= 1;m<=5;m++){
                            if(i != j && i != k && i != l &i != m &&
                                    j != k && j != l && j != m &&
                                    k != l && k!= m &&
                                    l != m){
                                int num = i*10000+j*1000+k*100+l*10+m;
                                System.out.println(num);
                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Total number: " + count);
    }
}
