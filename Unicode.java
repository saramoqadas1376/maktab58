import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Unicode {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.println("enter string:");

        String str=input.nextLine();
        System.out.println("enter index:");

        int index=input.nextInt();
        char ch=str.charAt(index);
        int uniCode=(int)ch;
        System.out.println(uniCode);        //first method
        System.out.println(Character.codePointAt(str,index));  //second method
        System.out.println(str.codePointAt(index));   //third method;
    }
}
