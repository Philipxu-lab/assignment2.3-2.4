
import java.util.Scanner;

class Password {
    public static void Main(String[]args) {
        Scanner scan = new Scanner(System.in);

        String pass = "hi";
        
        System.out.println("password?");
        pass = scan.nextLine();
        
        if (pass.equals("dragon")) {
        System.out.println("Issac is DUMB");
        } else {
            System.out.println("wrong answer.");
        }
    }
}
