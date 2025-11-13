package Final_Examination;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n;
        System.out.print("Enter array size : ");
        n = Sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array element : ");
        for(int i=0; i<n;i++){
            arr[i] = Sc.nextInt();
        }

        System.out.print("Your Array : ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();

        System.out.print("Sorted Array : ");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
