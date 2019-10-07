import java.util.Scanner;

class AddUntilNeg {
 public static void main(String[]args) {  
   Scanner scan = new Scanner(System.in); 
   int total = 0;
   int input = 0; 
   while (input >= 0) {
       System.out.println("Gimme a number");
       input = scan.nextInt();    
       total = total + input;
    }
    System.out.print("Total: ");
    System.out.println(total - input);
   }
}