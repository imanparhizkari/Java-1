import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("please enter your time in second :");
        Scanner inpout = new Scanner(System.in);
        int converToInt = inpout.nextInt();
        int hour = converToInt / 3600 ;
        int min = (converToInt%3600)/60;
        int second = min % 3600;
        System.out.println("result : \n"
         + "hour "+hour);
        System.out.println("min "+ min);
        System.out.println("second "+ second);


    }
}

