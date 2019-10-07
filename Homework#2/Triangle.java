import java.util.Scanner;

class Triangle {
 public static void main(String[]args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("What Character Would You Like For Your Triangle?");
     String character = scan.nextLine();
     System.out.println("How Tall Would You Like Your Triangle?");
     int height = scan.nextInt();
     System.out.println("Here You Go");
     for (int i = 0; i <= height; i++) {
         for (int j = 0; j < i; j++) {
             System.out.print(character + " ");
            }
            System.out.println("");
        }
     
    }
}