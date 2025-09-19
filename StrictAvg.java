import java.util.Scanner;

public class StrictAvg{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int avg = (a+b)/2;

        if(avg>c)
            System.out.println(a + b + " is greater than " + c);
        else
            System.out.println(a + b + " is not greater than " + c);
    }
}