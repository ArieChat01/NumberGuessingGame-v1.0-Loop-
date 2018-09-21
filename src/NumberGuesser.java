import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {

        int pickedNumber;
        int userNumber;
        Scanner keyboard;

        pickedNumber = (int) (Math.random() * 100);
        keyboard = new Scanner(System.in);

        System.out.print(pickedNumber + "\n");

        System.out.println("Welcome to the NumberGuessing Game!");
        System.out.println("Here's how to play. I am going to think of random number\nbetween 1 and 100.");
        System.out.println("It is your job, to try to guess that number.\nYou will have 5 opportunities.\n \nAre you ready?");
        System.out.print("What number am I thinking of?");
        System.out.println();
        int i = 5;

        userNumber = keyboard.nextInt();

        while (pickedNumber > userNumber || pickedNumber < userNumber || userNumber == pickedNumber) {
            if (i == 1){
                System.out.print("You have run out of tries.");
                System.exit(0);
            }

            else if (pickedNumber > userNumber) {
                System.out.print("Nope. That answer was too low.\nGuess again.\n");
                i--;
                System.out.println(i + " :tries left");
                userNumber = keyboard.nextInt();

            }
            else if (pickedNumber < userNumber){
                System.out.println("Nope. That answer was too high.\nGuess again.");
                i--;
                System.out.println(i + " :tries left.");
                userNumber = keyboard.nextInt();
            }

        }
    }
}
