import java.util.Scanner;

public class Exist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first string:");
        String firstString = input.nextLine();
        System.out.println("enter 2nd string:");
        String secondString = input.nextLine();
        boolean flag=false;
        for (int i=0;i<firstString.length();i++){
            String newStr;
            if (i+secondString.length()<firstString.length()+1){
                newStr=firstString.substring(i,i+secondString.length());
                if (secondString.equals(newStr))
                    flag=true;
                else
                    continue;

            }
        }
        if (flag==true)
            System.out.println("true");
        else
             System.out.println("false");

    }
}
