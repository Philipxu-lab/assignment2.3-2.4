import java.util.Scanner;

class Guess{

    public static void main(String[]args) {
 Scanner scan = new Scanner (System.in);
 int num = 0;            
 num = (int) (Math.random()*100) + 1;
 System.out.println("guess a Number Between 1 and 100");  
 
 for (int i = 0; i < 100; i++) {
     int guess = scan.nextInt();
     
     if (guess == num) {
         System.out.println("correct");
         System.out.println("It Took You " + (i + 1) + " Tries");
         i = 100;
        } else if (guess < num) {
         System.out.println("higher");   
        } else if (guess > num) {
         System.out.println("lower");   
        }
    }

}    
}