package tamrin3;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter string:");
        String str=input.next();
        int k=0;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    k++;

                }
            }
            System.out.println(str.charAt(i)+k);
        }
    }
}
