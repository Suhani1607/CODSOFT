import java.util.Scanner;
import java.util.Random;
class NumberGame{
    public static void main(String [] args){
       Random random=new Random();
       Scanner scan=new Scanner(System.in);
       int maxAttempt=10;
       boolean playagain=true;
       while(playagain){

        int numberToGuess=random.nextInt(100)+1;
        int numberofAttempt=0;
         boolean GuessCorrect=false;

        System.out.println("Generating Random number.....................................");

         while(numberofAttempt<maxAttempt && !GuessCorrect){
          System.out.println("Enter user choice number(1-100): ");
          int user_no=scan.nextInt();
          numberofAttempt++;

         

         if(user_no<numberToGuess){
          System.out.println("Too low");
         }
         else if(user_no > numberToGuess){
          System.out.println("Too high");
         }
         else{
          System.out.println("Congrats you guessed coorect number!!");
          GuessCorrect=true;
         }

       }

       System.out.println("Want to playagain (yes or no)!!");
       String agree=scan.next();
       playagain=agree.equalsIgnoreCase("yes");
      
      }
      System.out.println("Thank you for playing....Hope you enjoyed!!!");
       scan.close();
    
  }}