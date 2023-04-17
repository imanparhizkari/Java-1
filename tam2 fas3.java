
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println(" House 1 : Initial House Cost : 67000$   Annual fuel cost : 2300$   Tax rate 0.025$ " );
        System.out.println(" House 2 : Initial House Cost : 62000$   Annual fuel cost : 2500$   Tax rate 0.025$ " );
        System.out.println(" House 3 : Initial House Cost : 75000$   Annual fuel cost : 1850$   Tax rate 0.020$ " );

        System.out.println();

        int house1 = (5*2300)+67000;
        double h1 = (67000*0.025*5)+house1;
        int house2 = (5*2500)+62000 ;
        double h2 = (62000*0.025*5)+house2;
        int house3 = (5*1850)+75000 ;
        double h3 = (75000*0.020*5)+house3;

        System.out.println(" house cost 1 : "+h1 +" $");
        System.out.println(" house cost 2 : "+h2+ " $");
        System.out.println(" house cost 3 : "+h3 +" $");



    }
}
