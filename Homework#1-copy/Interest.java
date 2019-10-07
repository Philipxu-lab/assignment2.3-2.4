
import java.util.Scanner;
class Interest {
    public static void Main(String[]args) {
        Scanner scan = new Scanner(System.in);

        double principle;
        double rate;
        double time;
        double account;

        principle = scan.nextDouble();
        rate = scan.nextDouble();
        time = scan.nextDouble();

        account = principle*Math.pow(1+rate, time);

        System.out.println(account);
    }
}