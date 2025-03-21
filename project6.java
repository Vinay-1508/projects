import java.util.Random;
import java.util.Scanner;

public class project6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd =new Random();

        int guess  ;
        int attemps = 0;
        int min = 1;
        int max = 100;
        int rdnumber = rd.nextInt(min,max+1);

        System.out.println(" Welcome to Number guessing game :");
        System.out.println("please enter a number between 1 to 100");
        do {
            System.out.println("guess a number:");
            guess = sc.nextInt();
            attemps++;

            if (guess < rdnumber){
                System.out.println("your guess is too low");
            } else if (guess > rdnumber) {
                System.out.println("your guess is  too high");
            }else
                System.out.println("you have won");
                System.out.printf("number of %d",attemps);

        }while(guess != rdnumber);

        System.out.println("you have  guessed the right number"+ rdnumber);







    }
}
