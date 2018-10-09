/*
    David Zheng
    CIS 1068
    Assignment 4
 */
package nestegg;
/**
 *
 * @author dav
 */
import java.util.Scanner;
import java.util.Formatter;
public class NestEgg {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the starting balance in dollars?");
        Double startBal = scan.nextDouble();
        System.out.println("What's the yearly interest rate in percent?");
        Double interest = scan.nextDouble();
        System.out.println("For how many years will you be saving?");
        Integer years = scan.nextInt();
        
        System.out.println("Using: starting balance - " + startBal);
        System.out.println("yearly interest rate - " + interest);
        System.out.println("years to save - " + years);
        
        double yearly = startBal;
        double monthly = startBal;
        double daily = startBal;
        int i;
        System.out.println("| year | yearly  | monthly |  daily  |");
        for(i=0; i<years; i++) {
            int year = i + 1;
            
            yearly = yearly + (interest / 100 * yearly);
            monthly = monthly * Math.pow((1 + (interest / 100 / 12)), 12);
            daily = daily * Math.pow((1 + (interest / 100 / 365)), 365);
            System.out.format("|%6d|$%.2f|$%.2f|$%.2f|\n", year, yearly, monthly, daily);
        }
        
    }
    
}
