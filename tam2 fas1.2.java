import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("please enter your number 1 :");
        Scanner inpout = new Scanner(System.in);
        int x = inpout.nextInt();
        System.out.println("please enter your number 2 :");
        Scanner string = new Scanner(System.in);
        int y = inpout.nextInt();
        int zarb = x * y ;
        int jam = x + y ;
        int tagh = x / y ;
        int baghi = x % y ;
        int taf = x - y ;
        System.out.println("Total :" + jam);
        System.out.println("Minus :" + taf);
        System.out.println("Multiplication :" + zarb);
        System.out.println("Division :" + tagh);
        System.out.println("baghi mande :" + baghi);



    }
}