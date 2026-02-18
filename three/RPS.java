import java.util.Scanner;
import java.util.random.*;

class RPS {
    public static void main(String[] args) {

        String[] rps = {"Rock", "Paper", "Scissors"};

        boolean running = true;

        var input = new Scanner(System.in);

        while(running) {
            
            int randomInt = (int) (Math.random() * (2 + 1)); 
            
            System.out.printf("Please enter number 0-2 for [Rock, Paper, Scissors]: ");

            int choice = input.nextInt();

            boolean rockPaperWin = randomInt == 0 && choice == 1;
            boolean paperScissorsWin = randomInt == 1 && choice == 2;
            boolean scissorsRockWin = randomInt == 2 && choice == 1;

            String state = null;

            if (rockPaperWin || paperScissorsWin || scissorsRockWin) {
                state = "You Win!";
            }
            else if (randomInt == choice) {
                state = "You Draw";
                
            }
            else {
                state = "You lose :(";
            }

            System.out.printf("\n%s oppenent played: %s you played: %s\n", state, rps[randomInt], rps[choice]);

        }

        input.close();

    }
}