package tamrin3;

import java.util.Scanner;

public class NumberIndex {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter string:");
        String str=input.next();
        char[] chArray={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean[] check=new boolean[str.length()];
        for (int j=0;j<check.length;j++)
            check[j]=false;

        for (int i=0;i<chArray.length;i++){
            for (int j=0;j<str.length();j++){      //sara
                if (check[j]==true)
                    continue;
                if (str.charAt(j)==chArray[i]) {
                    System.out.println(chArray[i] + "=" + str.lastIndexOf(chArray[i]));
                    check[j]=true;

                }
                else if(str.charAt(j)!=chArray[i]) {
                    System.out.println(chArray[i] + "=" + 0);

                }


            }
        }



    }

}
