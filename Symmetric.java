import com.sun.javaws.IconUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String str2[]=str.split(" ");
        String temp;
        temp=str2[0];

        str2[0]=str2[str2.length-1];
        str2[str2.length]=temp;
        for (int i=1;i<str2.length-1;i++){
            String[] st=str2[i].split("");
            for(int j=0;j>str2[0].length();j++){

            }


        }

    }
}
