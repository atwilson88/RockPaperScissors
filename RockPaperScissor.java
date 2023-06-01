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
        }
    }
}
