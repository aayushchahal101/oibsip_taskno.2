import java.util.Random;
import java.util.Scanner;

public class Guessing_the_number {
    static int choice=1;
    static int level=1;
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);

    do{
       if(choice==1){
       Game(level);
       }
       if(choice==2){
        Guessing_the_number.level=0;
        break;
       }
       if(choice!=1){
        System.out.println("Choose either '1' or '2' ");
        choice=scan.nextInt();
       }
    }while(choice!=2);
    
}

public static void Game(int level) {
    Scanner scan=new Scanner(System.in);
    Random Random_number= new Random();
    int right_guess=Random_number.nextInt((50*level));
    int turns=0;
    System.out.printf("Level "+ level+":");
    System.out.println("Guess a number between 1 to " +(50*level)+ " You will have 10 turns!" );
    System.out.println("Best of luck!");
    
    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
      guess=scan.nextInt();
      turns++;
    
    if(guess==right_guess) {
      win=true;
    }
    else if(i>8){
      System.out.println("You loose! the right answer was: "+right_guess);
      return;
    }
    else if(guess<right_guess){
      i++;
      System.out.println("Yor Guess is lower than the right guess! Turns left: "+(10-i));
      System.out.print("Guess again: ");
      
      
      
    }
    else if(guess>right_guess) {
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: "+(10-i));
      System.out.print("Guess again: ");
      
    }
    
    

  }
    System.out.println("You win!");
    System.out.println("Then number was "+right_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    System.out.println("Would you like to play next level?\nEnter '1' to play and '2' to stop playing: ");
    choice=scan.nextInt();
    (Guessing_the_number.level)++;
}
}
