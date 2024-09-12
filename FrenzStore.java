/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frenzstore;

import java.util.Scanner;

/**
 *
 * @author yuanb
 */
public class FrenzStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Kaito Store!");
        Scanner enter = new Scanner(System.in);
        System.out.println("Input your age");
        int enter3 = enter.nextInt();
        System.out.println("is your age " + enter3 + "?");
        String trap = enter.next();

        double totalcost = 0;
        while (trap.equals("yes")) {

            System.out.println("Please select Product \n input number to Product Code \n Item \t \t \t \t \t \t \t Cost \t \t Code: \n 25k Carrat Gold Necklace 10 Grams \t \t \t PHP 45887.6 \t 1  \n 25k Carat White Gold Ring With Diamond 16 Grams "
                    + "\t PHP 73420.16 \t 2 \n Methamphetamine Hydro-Chloride 1 Gram \t \t PHP 1390.00 \t 3 \n Cannabis Sativa \t \t \t \t \t PHP 500 \t 4 \n Coke \t \t \t \t \t \t \t PHP 20 \t 5");

            int select = enter.nextInt();
            double price = 0;
            String productName = "";

            switch (select) {
                case 1:
                    price = 45887.6;
                    productName = "25k Carat Gold Necklace (10g)";
                    break;
                case 2:
                    price = 73420.16;
                    productName = "25k Carat White Gold Ring (16g)";
                    break;
                case 3:
                    price = 1390.00;
                    productName = "Methamphetamine Hydro-Chloride (1g)";
                    break;
                case 4:
                    price = 500.00;
                    productName = "Cannabis Sativa";
                    break;
                case 5:
                    price = 20.00;
                    productName = "Coke";
                    break;
            }
            System.out.println("You selected " + productName + " for PHP " + price + "\nEnter quantity:");
            double quantity = enter.nextDouble();
            double subtotal = price * quantity;
            totalcost += subtotal;
            System.out.println("Subtotal: " + quantity + " * " + price + " = PHP " + subtotal);

            // Ask if user wants to order another item
            System.out.println("Do you want to order another item? (yes/no)");
            trap = enter.next(); // update `trap` for the loop condition
        }
        System.out.println("Total: PHP " + totalcost);

        // Ask user to enter the payment amount
        double payment = 0;
        do {
            System.out.println("Please enter the amount of money to pay: ");
            payment = enter.nextDouble();

            // Check if payment is sufficient
            if (payment < totalcost) {
                System.out.println("Insufficient funds. You need at least PHP " + (totalcost - payment) + " more.");
            } else {
                double change = payment - totalcost;
                System.out.println("Payment accepted. Your change is PHP " + change);
            }
        } while (payment < totalcost);
    }

}
