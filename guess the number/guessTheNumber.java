import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Random random = new Random();

     int numberToGuess = random.nextInt(1 ,100);
     int attemp = 0;
     int userGuess = 0;
     int maxAttempts = 7;
     int score = 70;

     System.out.println("Welcome to 'Guess the Number' game!");
     System.out.println("Select a number 1 to 100.");
     System.out.println("you have "+maxAttempts+" attempts to guess the correct number.");

     while(attemp<maxAttempts){
        System.out.println("Enter your guess:");
        userGuess = sc.nextInt();
        attemp++;
        score -=10;

        if(userGuess == numberToGuess){
            System.out.println("Congratulation! you guessed the correct number "+numberToGuess+" in "+attemp+" attempts.");
            break;
        }else if(numberToGuess < userGuess){
            System.out.println("Too high! Try again.");

     }else {
        System.out.println("Too Low! Try again.");

     }
     System.out.println("Your current score is: "+score);
     
    }
    sc.close();
}
}