import java.util.Scanner;

public class Exam{
    public static void main(String[] args){
        int x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        int total_std = x*y;
        int passed_std;
        passed_std = sc.nextInt();
        float percent_passed = ((float)passed_std/total_std) * 100;
        System.out.println("Passed student: " + percent_passed);

        if(percent_passed>50.0){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
        }