import java.util.Scanner;

public class Capitalization{
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        if(str != null && !str.isEmpty()){
            String firstcha = str.substring(0,1).toUpperCase();
            String reststring = str.substring(1);
            System.out.println(firstcha + reststring);
        }
        else{
            System.out.println("Null");
        }
    }
}