import java.util.Scanner;

public class TooLongWord{
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        int len = str.length();

        boolean found = false;
        if(len>10){
            System.out.println(str.charAt(0) + "" + (len-2) + "" + str.charAt(len-1));
        }
        else{
            System.out.println(str);
        }

    }
}