import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" The pythagorean theorem says\n" +
                " that the sum of the square of\n" +
                "the tow sides of a right triangle is\n"+
                "equal to the square of the chord");
        System.out.print("OK, Now enter your first number : ");
        Scanner number1 = new Scanner(System.in);
        int x = number1.nextInt();
        System.out.print( "enter second number : " );
        Scanner number2 = new Scanner(System.in);
        int y = number2.nextInt();
        int side1 = (x*x)-(y*y);
        int hypotenuse = (x*x)+(y*y);
        int side2 = 2*x*y;
        System.out.println(" Pythagorean trinity is : ");
        System.out.println(" Side 1 is : " + side1);
        System.out.println(" Side 2 is : " + side2);
        System.out.println(" Hypotenuse is : " + hypotenuse);


    }
}

