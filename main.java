import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args){

       String[] choices = {"rock", "paper", "sciccors"};
    
       String computerMove = choices[new Random().nextInt(choices.length)];
       Scanner scanner = new Scanner(System.in);
       String playerMove;
       while(true) {
       System.out.println(" please eneter your move ( Rock , Paper, or scissors)");
       playerMove = scanner.nextLine();
       if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Sciccors")){
           break;
       }
    System.out.println(playerMove + " This is rock, paper, sciccors. How did you mess that up");
       }
       System.out.println("The Computer's move was " + computerMove);
    }
}