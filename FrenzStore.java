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

        boolean main = true;

        while (main == true) {

            System.out.println("Welcome to Kaito Store!");
            Scanner enter = new Scanner(System.in);
            System.out.println("Do you want to go shop?");
            String trap = enter.next();
            String code;
            boolean check = false;
            double totalcost = 0.00;
            String rer = "";
            while (trap.equalsIgnoreCase("yes")) {  

                System.out.println("Please select Product \n input number to Product Code \n Item \t \t \t \t \t \t \t Cost \t \t Code: \n 25k Carrat Gold Necklace 10 Grams \t \t \t PHP 45887.6 \t 1  \n 25k Carat White Gold Ring With Diamond 16 Grams "
                        + "\t PHP 73420.16 \t 2 \n Methamphetamine Hydro-Chloride 1 Gram \t \t PHP 1390.00 \t 3 \n Cannabis Sativa \t \t \t \t \t PHP 500 \t 4 \n Coke \t \t \t \t \t \t \t PHP 20 \t 5");

                int select = enter.nextInt();
                double price = 0;
                String productName = "";
                

                switch (select) {
                    case 1:
                        price = 45887.6;
                        productName = "25k Carat Gold Necklace (10g)";
                       
                        check = true;
                        break;
                    case 2:
                        price = 73420.16;
                        productName = "25k Carat White Gold Ring (16g)";
                       
                        check = true;
                        break;
                    case 3:
                        price = 1390.00;
                        productName = "Methamphetamine Hydro-Chloride (1g)";
                        check = true;
                        break;
                    case 4:
                        price = 500.00;
                        productName = "Cannabis Sativa";
                       
                        check = true;
                        break;
                    case 5:
                        price = 20.00;
                        productName = "Coke";
       
                        check = true;
                        break;
                }
                if (check == true) {
                    System.out.println("You selected " + productName + " for PHP " + price + "\nEnter quantity:");
                    double quantity = enter.nextDouble();
                    double subtotal = price * quantity;
                    totalcost +=  subtotal;
                    rer += productName + "\t" +quantity + "\t" + price + "\n";
                    System.out.println("Subtotal: " + quantity + " * " + price + " = PHP " + subtotal);
                    // Ask if user wants to order another item
                    System.out.println("Do you want to order another item? (yes/no)");
                    trap = enter.next(); // update `trap` for the loop condition

                }
                if (trap.equalsIgnoreCase("no")) {
                    System.out.println("You selected \n" + rer);
                    System.out.println("Total: PHP " + totalcost);
                    System.out.println("DO you have a voucher? Please input in the system. Otherwise, input no");
                    code = enter.next();
                    if (code.equalsIgnoreCase("SirJamieUnoLang")) {
                        double discount = (totalcost * (-0.15));
                    totalcost = totalcost + discount ;
                    System.out.println("You selected \n" + rer);
                    System.out.println("Discount " + (discount*-1) + "\nTotal: PHP " + totalcost);
                    } else {}
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
                        System.out.println("Payment accepted. Your change is PHP " + change + "\nThank you for Shopping With Us!");
                    }
                } while (payment < totalcost);
                System.out.println("-------------------------------------------------");
            }

        }
    }
}
}