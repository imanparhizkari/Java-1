import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("the covered distance : ");
        Scanner covered = new Scanner(System.in);
        int km = covered.nextInt();
        System.out.print("the coast of each liter of gasoline : ");
        Scanner each = new Scanner(System.in);
        int oil = each.nextInt();
        System.out.print("the car foul consumption : ");
        Scanner coast = new Scanner(System.in);
        int car = each.nextInt();
        double klm = km / 100 ;
        double total = klm * car ;
        double travelexpenses = total * oil ;
        System.out.print("travel expenses is : " + travelexpenses + " $");


    }
}