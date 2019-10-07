
import java.util.Scanner;
class Dice {
    public static void Main(String[]args) {
        int roll = 0;

        for (int i = 1; i < 11; i++) {
            roll = (int) (Math.random()*6) + 1;
            System.out.println("Die Roll " + i + ": " + roll);
        }
    }
}
