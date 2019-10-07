import java.util.Scanner;

class DrawBar{
    
 public static void main(String[]args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("What Character Would You Like For Your Bar?");
     String character = scan.nextLine();
     System.out.println("How Long Would You Like It?");
     int length = scan.nextInt();
     System.out.println("Here You Go");
     for (int i = 0; i < length; i++) {
         System.out.print(character + " ");
        }
     
    }
    
}