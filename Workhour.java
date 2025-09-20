import java.util.Scanner;

public class Workhour{
    public static void main(String[] args){
        float x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        float weekdays = 4*x;
        float chillday;
        chillday = sc.nextFloat();
        float total_hours = weekdays + chillday;
        System.out.println("Total number of working hourse: " + total_hours);
    }
}