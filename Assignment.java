import java.util.Scanner;

public class Assignment{
    public static void main(String[] args){
        int assign = 3;
        int total_time = assign*1;
        float start_time;
        Scanner sc = new Scanner(System.in);
        start_time = sc.nextFloat();
        if((int)start_time == 12){
            start_time = start_time-(int)start_time;
        }

        if((start_time+total_time)<10){
            System.out.println("He can complete the assignment");
        }
        else{
            System.out.println("He can't complete the assignment");
        }

    }
}