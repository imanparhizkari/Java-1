import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("please enter your numerator 1 : ");
        Scanner scanner1 = new Scanner(System.in);
        double x1 = scanner1.nextInt();
        System.out.print("please enter your denominator 1 : ");
        Scanner scanner11 = new Scanner(System.in);
        double x11 = scanner11.nextInt();
        System.out.print("please enter your numerator 2 : ");
        Scanner scanner2 = new Scanner(System.in);
        double x2 = scanner2.nextInt();
        System.out.print("please enter your denominator 2 : ");
        Scanner scanner22 = new Scanner(System.in);
        double x22 = scanner22.nextInt();
        double x3 = (x1*x2) / (x11*x22) ;
        System.out.print(" your response : " + x3) ;


    }
}
