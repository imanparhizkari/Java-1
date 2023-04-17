import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y, x1, y1 ,areahouse , areayard, area;
        System.out.print("please enter your lenght of the yard : ");
        Scanner lenght = new Scanner(System.in);
        x = lenght.nextInt();
        System.out.print("please enter your width of the yard : ");
        Scanner width = new Scanner(System.in);
        y = width.nextInt();
        System.out.print("please enter your lenght of the house : ");
        Scanner leghth = new Scanner(System.in);
        x1 = leghth.nextInt();
        System.out.print("please enter your width of the house : ");
        Scanner widthh = new Scanner(System.in);
        y1 = widthh.nextInt();
        areahouse = x1 * y1;
        areayard = x * y;
        area = areayard-areahouse;
        double secou = area / 3.2 ;
        double min = secou / 60 ;
        System.out.println("yard area : " + areayard+" Meter");
        System.out.println("house area : " + areahouse+" Meter");
        System.out.println("the area of the lawns : " + area +" Meter");
        System.out.println("mower speed : 3.2 m/s ");
        System.out.println("time to do lawn mower work : " +min + " minutes" );
        // end



    }
}