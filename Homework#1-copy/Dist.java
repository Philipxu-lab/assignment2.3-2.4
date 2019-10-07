import java.util.Scanner;

class Dist {
    public static void Main(String[]args) {
        Scanner scan = new Scanner(System.in);

        double x1;
        double x2;
        double y1;
        double y2;
        double dist;

        x1= scan.nextDouble();
        y1= scan.nextDouble();
        x2= scan.nextDouble();
        y2= scan.nextDouble();

        dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

     
        System.out.println(dist);
    }
}

