import java.util.Scanner;

public class GuessGame {

    public static void main(String [] args){
        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Guess the number between 1 and 100 in maximum 10 tries!");
        Scanner scanner =  new Scanner(System.in);
        boolean found = false;

        for (int i=10; i>0; i--) {
            System.out.println("You have " + i + " tries left");
            int guess = scanner.nextInt();

            if (guess > randomNumber){
                System.out.println("The number is less than " + guess);
            }
            else if (guess < randomNumber){
                System.out.println("The number is greater than "+ guess);
            }
            else{
                System.out.println("You FOUND IT!");
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("You lose :(");
        }

}}
