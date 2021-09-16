import java.util.Scanner;

public class Exist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first string:");
        String firstString = input.nextLine();
<<<<<<< HEAD
        System.out.println("enter third string:");
=======
        System.out.println("enter 2nd string:");
>>>>>>> faa335a5cd4a03952b69cd7b7a65715b0a2c8ba6
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
