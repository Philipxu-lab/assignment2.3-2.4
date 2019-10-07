import java.util.Scanner;

class EightBall{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num = (int) (Math.random()*20) + 1;
        
        System.out.println("Ask your question");
        
        scan.nextLine();
        
        if(num == 1){
            System.out.println("ya probably");
        }else if(num == 2){
            System.out.println("absolutely not");
        }else if(num == 3){
            System.out.println("ehhh depends on the day");
        }else if(num == 4){
            System.out.println("no chance");
        }else if(num == 5){
            System.out.println("are you kidding me? of course");
        }else if(num == 6){
            System.out.println("eenie meenie minie NO");
        }else if(num == 7){
            System.out.println("honestly, who even knows");
        }else if(num == 8){
            System.out.println("most likely not");
        }else if(num == 9){
            System.out.println("uhh why would you eve ask that");
        }else if(num == 10){
            System.out.println("can't tell you");
        }else if(num == 11){
            System.out.println("go home buddy");
        }else if(num == 12){
            System.out.println("man that's obvious");
        }else if(num == 13){
            System.out.println("maybe, maybe not");
        }else if(num == 14){
            System.out.println("sir you are stupid");
        }else if(num == 15){
            System.out.println("no you idiot");
        }else if(num == 16){
            System.out.println("uhhh yes an no");
        }else if(num == 17){
            System.out.println("yes");
        }else if(num == 18){
            System.out.println("no");
        }else if(num == 19){
            System.out.println("ur a bum");
        }else{
            System.out.println("ask someone else");
        }
    }
}