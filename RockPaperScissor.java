import java.util.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while(true) {
            //1. Random Computer Move
        String [] availableMoves = {"Rock", "Paper", "Scissors"};
        String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];

        System.out.println("Computer has chosen its move.");
            System.out.println();
        System.out.println("Now it's your turn to choose! Good luck!");
            System.out.println();

            //2. Player's Move
        String userMove;

        while(true) {
            System.out.println("Please select a move from the available moves: 'Rock' 'Paper' 'Scissors' ");
            System.out.println("Enter your chosen move: ");
            userMove = scn.nextLine();

            // Checking for valid move
            if(userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")){
                System.out.println();
                break;
            }

            // If input is invalid
            System.out.println();
            System.out.println("Invalid Move!");
            System.out.println("Please enter the move from the available moves only!");
            System.out.println();
        }

        // Print out the computer's choice
            System.out.println("computer chose: " + computerMove);

        //3. Comparing the user and the computer's choices
        }
    }
}
