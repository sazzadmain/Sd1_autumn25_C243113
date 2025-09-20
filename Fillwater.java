import java.util.Scanner;

public class Fillwater{
    public static void main(String[] args){
        int b1,b2,b3;
        Scanner sc = new Scanner(System.in);
        b1 = sc.nextInt();
        b2 = sc.nextInt();
        b3 = sc.nextInt();

        if((b1==0 && b2==0) || (b2==0 && b3==0) || (b1==0 && b3==0))
            System.out.println("Water filling time");
        else
            System.out.println("Not now");

    }
}