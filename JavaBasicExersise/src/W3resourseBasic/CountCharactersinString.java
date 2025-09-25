package W3resourseBasic;

import java.util.Scanner;

public class CountCharactersinString {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = Sc.nextLine();
        int l = str.length();
        int letter = 0,space = 0,number = 0,other = 0;

        for(int i=0 ; i<l ; i++) {
            char s = str.charAt(i);
            s = Character.toUpperCase(s);
            if(s>='0' && s<='9')
                number += 1;

            else if(s>='A' && s<='Z')
                letter += 1;

            else if(s == ' ')
                space += 1;

            else
                other += 1;
        }
        System.out.println("Letters : " + letter);
        System.out.println("Numbers : " + number);
        System.out.println("Spaces : " + space);
        System.out.println("Others : " + other);
    }
}
