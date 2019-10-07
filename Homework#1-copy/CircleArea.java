
import java.util.Scanner;

class CircleArea {
    public static void Main(String[]args) {
        Scanner scan = new Scanner(System.in);

        double radius;
        double area;

        radius = scan.nextDouble();

        area = Math.PI*Math.pow(radius,2);

        System.out.println(area);
    }
}