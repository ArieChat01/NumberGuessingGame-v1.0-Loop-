import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        int pickedNumber;
        int userNumber;
        Scanner keyboard;
        String userPlayAgain;
        boolean notWonGame;
        boolean playAgain;
        String emptySpace;

        pickedNumber = (int) (Math.random() * 100);
        keyboard = new Scanner(System.in);
        notWonGame = true;
        playAgain = true;

        while (playAgain) {

        System.out.println("Welcome to the NumberGuessing Game!");
        System.out.println("Here's how to play. I am going to think of random number\nbetween 1 and 100.");
        System.out.println("It is your job, to try to guess that number.\nYou will have 5 opportunities.\n \nAre you ready?");
        System.out.print("What number am I thinking of?");
        System.out.println();
        int i = 5;

        userNumber = keyboard.nextInt();


            while (notWonGame) {

                if (i == 1) {
                    System.out.println("You have run out of tries.");
                    break;
                } else if (pickedNumber > userNumber) {
                    System.out.print("Nope. That answer was too low.\nGuess again.\n");
                    i--;
                    System.out.println(i + " :tries left");
                    userNumber = keyboard.nextInt();

                } else if (pickedNumber < userNumber) {
                    System.out.println("Nope. That answer was too high.\nGuess again.");
                    i--;
                    System.out.println(i + " :tries left.");
                    userNumber = keyboard.nextInt();
                } else if (pickedNumber == userNumber) {
                    System.out.println("You win!");
                    notWonGame = false;
                }
            }
            System.out.println("\nWant to play again?(Answer \"yes\" or \"no\")");
            emptySpace = keyboard.nextLine();
            userPlayAgain = keyboard.nextLine();
            if (userPlayAgain.equals("yes")){
             playAgain = true;
            }
            else if (!userPlayAgain.equals("yes")){
                System.out.println("Thanks for Playing!");
                playAgain = false;
            }

        }
    }
}