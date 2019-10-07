
import java.util.Scanner;

class Grade {
    public static void Main(String[]args) {
        Scanner scan = new Scanner(System.in);

      double total = 0;
      double mark = 0;
      
      
  
      
        System.out.println("What was your test out of?");
        total = scan.nextDouble();
        System.out.println("What's your mark?");
        mark = scan.nextDouble();
        double grade = (mark/total);
        grade = grade*100;
        
        if (grade >= 86) {
        System.out.println("That's an A, good job!");
        } else if (grade <= 85 && grade >= 73){
            System.out.println("That's a B, not bad!");
        } else if (grade <= 72 && grade >= 67) {
            System.out.println("That's a C+, decent.");
        } else if (grade <= 66 && grade >= 60) {
             System.out.println("That's a C, you can do better.");
        } else if (grade <= 59 && grade >= 50) {
             System.out.println("That's a C-, retake time.");
        } else if (grade <= 49) {
             System.out.println("That's a F, I have no words...");
        } else {
             System.out.println("WTF");   
        }
    }
}

