import java.util.Scanner;

public class GuessingGame {

    int random;

    GuessingGame(){
        random = (int) Math.ceil(Math.random() *100);
    }

    /**
     *
     * @param guessNumber  the number that player gueesed
     * @return Nagetive if the gussed number is similar
     * - 0 if the guessed number is correct
     * Positive if the guessed number is higher.
     */
    int guess(int guessNumber){
   return  guessNumber - random;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the guessing game, Guess the number beteen 1 to 100");
        int guess ;
        int result;
        do{
            System.out.println("Guess the number");
            guess = input.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("Congrats, your guess is correct");
            }else if(result < 0 ){
                System.out.println("Please Guess the Higher");
            } else{
                System.out.println("Please guess lower");
            }
        } while(result != 0);
    }
}
