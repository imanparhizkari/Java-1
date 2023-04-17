import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(" enter a number between 1 and 10 : ");
        Scanner player = new Scanner(System.in);
        int n = player.nextInt();
        System.out.print(" random number : ");
        Random generator = new Random();
        System.out.println( generator .nextInt(10) +1);
        System.out.print("enter a random number ( look up {^_^} ) : ");
        Scanner computer = new Scanner(System.in);
        int r = computer.nextInt();
        int move = ((r-n)+1)*n ;
        System.out.println(" your move : " + move );

    }
}