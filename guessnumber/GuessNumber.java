package guessnumber;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String args[]) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int randInt = r.nextInt(100);

        System.out.println("Guess the number.");
        String strNum = s.nextLine();
        int numGuessed = 101;

        while (numGuessed != randInt || strNum == "quit") {
            numGuessed = Integer.parseInt(strNum);
            if (numGuessed > randInt) {
                System.out.println("The number is lower than that.");
            }
            else {
                System.out.println("The number is higher than that.");
            }
            strNum = s.nextLine();
        }
        if (numGuessed == randInt) {
            System.out.println("You have correctly guessed the number!");
        }
    }   
}
