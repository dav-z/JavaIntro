/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dav
 */
public class Lab7 {
    
    static String userChance;
    static String playRound;
    static char compMove;
    static String computerMove;
    static int count = 0;
    static int countOfUserWin = 0;
    static int countOfCompWin = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play a round? (y/n)");
        playRound = scanner.next();
        while (!playRound.equals("n")) {
            Lab7 v = new Lab7();
            //printing the rules of the game
            v.gameRules();
            //take user input as K, B G or V
            userChance = scanner.next();
            //Fetching user input as per the entry
            userChance = v.getUserInput(scanner);
            System.out.println("Your move : " + userChance);
            //Fetching Computer move
            compMove = v.computerMove();
            if (compMove == 'K') {
                computerMove = "Knoppäng";
                System.out.println("Computer move = " + computerMove);
            } else if (compMove == 'B') {
                computerMove = "Björnarp";
                System.out.println("Computer move = " + computerMove);
            } else if (compMove == 'G') {
                computerMove = "Grönby";
                System.out.println("Computer move = " + computerMove);
            } else {
                computerMove = "Vilshult";
                System.out.println("Computer move = " + computerMove);
            }
            //Calculating who won as per the rules
            if(v.whoWon(userChance,computerMove).equalsIgnoreCase("You won!!!"))
            {countOfUserWin = countOfUserWin+1;}
            else countOfCompWin = countOfCompWin +1;
            System.out.println(v.whoWon(userChance,computerMove));
            System.out.println("Would you like to continue?");
            playRound = scanner.next();
        }
        Lab7 v = new Lab7();
        v.gameEnd(count,countOfUserWin,countOfCompWin);
    }
    
     public void gameRules() {
        System.out.println("Following are the rules of the game: \n" +
                "1. Knoppäng beats Björnarp and Grönby\n" +

                "2. Björnarp beats Grönby\n" +

                "3. Grönby beats Vilshult\n" +

                "4. Vilshult beats Knoppäng and Björnarp\n" +

                "5. The computer wins in the event of a tie.\n");
        System.out.println("Enter your move : Knoppäng(K), Björnarp(B), Grönby(G), or Vilshult(V)");
    }
    //Calculate Computer move
    public char computerMove() {
        String alphabet = "KBGV";
        Random rnd = new Random();
        //get random move of computer
        char compMove = alphabet.charAt(rnd.nextInt(alphabet.length()));
        return compMove;
    }
    //Calculate who won
    public String whoWon(String userChance, String computerMove) {
        if ((userChance.equals("Knoppäng") && (computerMove.equals("Björnarp") || computerMove.equals("Grönby"))) || (userChance.equals("Björnarp") && computerMove.equals("Grönby")) || (userChance.equals("Grönby") && computerMove.equals("Vilshult")) || (userChance.equals("Vilshult") && (computerMove.equals("Knoppäng") || computerMove.equals("Björnarp")))) {
            { return ("You won");
            }
        } else if (userChance.equals(computerMove)) {
            return ("Computer won");
        } else {
            return ("Computer won");
        }
    }
    //Get user input
    public String getUserInput(Scanner scanner) {
        while (!(userChance.equalsIgnoreCase("K") || userChance.equalsIgnoreCase("B") || userChance.equalsIgnoreCase("G") || userChance.equalsIgnoreCase("V"))) {
            System.out.println("Enter correct move : Knoppäng, Björnarp, Grönby, or Vilshult");
            userChance = scanner.next();
        }
        count = count +1;
        if (userChance.equalsIgnoreCase("K")) {
            userChance = "Knoppäng";
        } else if (userChance .equalsIgnoreCase("B")) {
            userChance = "Björnarp";
        } else if (userChance.equalsIgnoreCase("G")) {
            userChance = "Grönby";
        } else if (userChance.equalsIgnoreCase("V")){
            userChance = "Vilshult";
        }
        return userChance;
    }
    //On game end when user does not want to continue
    public void gameEnd(int count, int countOfUserWin, int countOfCompWin) {
        System.out.println("Total number of times played : " + count);
        System.out.println("Number of time you won : " + countOfUserWin);
        System.out.println("Number of time computer won : " + countOfCompWin);
    }
    
    
}
