import java.util.Scanner;

class RollDice {
 public static void Main (String[]args) {
     int total = 0;
     String answer = "y";
     System.out.println("Would You Like to Play the Game? [y or n]");
     Scanner scan = new Scanner(System.in); 
     
     while (answer.equals("y")) {
     answer = scan.nextLine(); 
     
     System.out.println("How Many Dice Would You Like to Roll?");
     int rolls = scan.nextInt();
     
     System.out.print("You Got: ");
     
     for (int i = 0; i < rolls; i++) {
         
     int roll = (int) (Math.random()*6) + 1;
     
     System.out.print(roll + " ");
     total = total + roll;
     
    }
    System.out.println("");
    System.out.println("Your total is: " + total);
    total = 0;
    System.out.println("Would You Like to Play Again? [y or n]"); 
    
    answer = scan.next();
}
}
}