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
        System.out.println("It is your job, to try to guess that number.\nYou will have 6 opportunities.\n \nAre you ready?");
        System.out.print("What number am I thinking of?");
        System.out.println();

        userNumber = keyboard.nextInt();

        while(pickedNumber>userNumber || pickedNumber<userNumber){
            System.out.print("Nope. That answer was too low.\nGuess again.\n");
            userNumber=keyboard.nextInt();
            }
        System.out.println("That it you got it right!");
    }
}

