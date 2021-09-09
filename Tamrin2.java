import java.util.Scanner;

public class Tamrin2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.next();


        String ch[] = st.split("");
        String temp = "";
        int counter = 1;
        boolean flag = false;
        int count[]=new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {

                // / ch[i] = ch[i].trim();
                if (ch[i].equals(ch[j]) && !ch[i].equals("")) {
                    temp = ch[i];

                    counter++;
                    flag = true;
                }
                else{
                    temp=ch[i];
                }

            }

            if (flag) {

                System.out.println(temp + " : " + counter);
                flag = false;
                count[i]=counter;
                counter = 1;
            }
            else {
                count[i]=counter;
            }

        }
    }


}
