import java.util.Scanner;

public class Odd{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a==b){
            if(a%2!=0){
                System.out.println("Odd: " + a);
            }
            else if(c%2!=0) {
                System.out.println("Odd: " + c);
            }
            else{
                System.out.println("There is no odd number");
            }
            System.out.println("Occurs once: " + c);
        }

        else if(b==c){
            if(b%2!=0){
                System.out.println("Odd: " + b);
            }
            else if(a%2!=0) {
                System.out.println("Odd: " + a);
            }
            else{
                System.out.println("There is no odd number");
            }
            System.out.println("Occurs once: " + a);
        }

        else{
            if(a%2!=0){
                System.out.println("Odd: " + a);
            }
            else if(b%2!=0) {
                System.out.println("Odd: " + b);
            }
            else{
                System.out.println("There is no odd number");
            }
            System.out.println("Occurs once: " + b);
        }
    }
}