import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first string:");
        String firstString = input.next();
        System.out.println("enter second string:");
        String secondString = input.next();
        int index = 0;
        String newStr;
        for (int i = 0; i < firstString.length(); i++) {
                if (i+secondString.length()<firstString.length()+1){
                    newStr = firstString.substring(i, i+secondString.length());
                    if (newStr.equals(secondString))
                        index = i;

                }
                else
                    break;







        }
        System.out.println("index="+ index);


    }
}
