package assignment3;

import java.util.Random;
import java.util.Scanner;

public class Guessnumber{
    
    public static void main(String[] args){
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int number= random.nextInt(10)+1;
        int i=5;
        int no=0;
        while(no<5){
            System.out.println("Pick a number from 1 to 10. You have" + i + "guesses left");
            i--;
            int guess=scanner.nextInt();
            if(guess==number){
                System.out.println("Congratulations! You win.");
                break;
            }
            else if(guess>number){
                System.out.println("The number is lower! Try again.");
            }
            else{
                System.out.println("The number is higher! Try again.");
            }
            no++;      
        }
        if(i==0){
            System.out.println("Your turn has been finished. Please try again!");
        }
        
    }
}