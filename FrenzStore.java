/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frenzstore;

import java.util.Scanner;
import javax.swing.JOptionPane;

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

            String trap = JOptionPane.showInputDialog( "Welcome to Kaito Store! \n Do you want to go shop?");
            String code;
            boolean check = false;
            
            boolean repeat = false;
            double totalcost = 0.00;
            String[] product = {"[1]    25k Carrat Gold Necklace 10 Grams", "[2]    25k Carat White Gold Ring With Diamond 16 Grams","[3]    Methamphetamine Hydro-Chloride 1 Gram", "[4]    Cannabis Sativa","[5]   Coke"};
            double[] prices = {45887.6, 73420.16, 1390.00, 500.00, 20.00};
            String rer = "";
            double discount;
            while (trap.equalsIgnoreCase("yes")) {  

                String sel = JOptionPane.showInputDialog("Please select Product "
                                                        + "\n input number to Product Code "
                                                        + "\n Item                    Cost              Code"
                                                        + "\n Shabu                PHP 45887.6        1"
                                                        + "\n Marijuana           PHP 73420.16     2"
                                                        + "\n Lambing              PHP 1390.00      3"
                                                        + "\n Friend Zoned     PHP 500             4"
                                                        + "\n F.R.I.E.N.D.S      PHP 20               5");

               int select = Integer.parseInt(sel);
                double price = 0;
                String productName = "";
                

                switch (select) {
                    case 1:
                        price = prices[0];
                        productName = product[0];
                       
                        check = true;
                        break;
                    case 2:
                        price = prices[1];
                        productName = product[1];
                       
                        check = true;
                        break;
                    case 3:
                        price = prices[2];
                        productName = product[2];
                        check = true;
                        break;
                    case 4:
                        price = prices[3];
                        productName = product[3];
                       
                        check = true;
                        break;
                    case 5:
                        price = prices[4];
                        productName = product[4];
       
                        check = true;
                        break;
                }
                if (check == true) {
                    String quant = JOptionPane.showInputDialog("You selected " + productName + " for PHP " + price + "\nEnter quantity:"); 
                    int quantity = Integer.parseInt(quant);
                    double subtotal = price * quantity;
                    totalcost +=  subtotal;
                    rer += productName + "\t" +quantity + "\t" + price + "\n";
                    JOptionPane.showMessageDialog(null, "Subtotal: " + quantity + " * " + price + " = PHP " + subtotal);
                    // Ask if user wants to order another item
                    trap = JOptionPane.showInputDialog("Do you want to order another item? (yes/no)");
                    

                }
                if (trap.equalsIgnoreCase("no")) {
                    code = JOptionPane.showInputDialog("You selected \n" + rer + "\nTotal: PHP " + totalcost + "\nDO you have a voucher? Please input in the system. Otherwise, input no");
                    
                    if (code.equalsIgnoreCase("SirJamieUnoLang")) {
                        discount = (totalcost * (-0.99));
                    totalcost = totalcost + discount ;
                    JOptionPane.showInputDialog("You selected \n" + rer);
                    JOptionPane.showInputDialog("Discount " + (discount*-1) + "\nTotal: PHP " + totalcost);
                    } if (code.equalsIgnoreCase("Special")) {
                         discount = (totalcost * (-0.12));
                    totalcost = totalcost + discount ;
                    JOptionPane.showInputDialog("You selected \n" + rer);
                    JOptionPane.showInputDialog("Discount " + (discount*-1) + "\nTotal: PHP " + totalcost);
                    }
                    if (code.equalsIgnoreCase("10%Offnow")) {
                         discount = (totalcost * (-0.1));
                    totalcost = totalcost + discount ;
                    JOptionPane.showInputDialog("You selected \n" + rer);
                    JOptionPane.showInputDialog("Discount " + (discount*-1) + "\nTotal: PHP " + totalcost);
                    } if (code.equalsIgnoreCase("Done 50%")) {
                         discount = (totalcost * (-0.50));
                    totalcost = totalcost + discount ;
                    JOptionPane.showInputDialog("You selected \n" + rer);
                    JOptionPane.showInputDialog("Discount " + (discount*-1) + "\nTotal: PHP " + totalcost);
                    }
                 
                    switch (code) {
                        case "178562":
                            JOptionPane.showInputDialog("90% dicount code");
                             discount = (totalcost * (-0.90));
                    totalcost = totalcost + discount ;
                    JOptionPane.showInputDialog("You selected \n" + rer);
                    JOptionPane.showInputDialog("Discount " + (discount*-1) + "\nTotal: PHP " + totalcost);
                    break;
                    case "08042005":
                            JOptionPane.showInputDialog("90% dicount code");
                             discount = (totalcost * (-0.90));
                    totalcost = totalcost + discount ;
                    JOptionPane.showInputDialog("You selected \n" + rer);
                    JOptionPane.showInputDialog("Discount " + (discount*-1) + "\nTotal: PHP " + totalcost);
                    break;
                    case "897456":
                            JOptionPane.showInputDialog("90% dicount code");
                             discount = (totalcost * (-0.90));
                    totalcost = totalcost + discount ;
                    JOptionPane.showInputDialog("You selected \n" + rer);
                    JOptionPane.showInputDialog("Discount " + (discount*-1) + "\nTotal: PHP " + totalcost);
                    break;
                    }
                // Ask user to enter the payment amount
                double payment = 0;
                do {
                   String pay = JOptionPane.showInputDialog("Please enter the amount of money to pay: ");
                   payment = Double.parseDouble(pay);
                     

                    // Check if payment is sufficient
                    if (payment < totalcost) {
                        JOptionPane.showInputDialog("Insufficient funds. You need at least PHP " + (totalcost - payment) + " more.");
                    } else {
                        double change = payment - totalcost;
                        JOptionPane.showMessageDialog(null, "Payment accepted. Your change is PHP " + change + "\n Products: \n" + rer + "\nThank you for Shopping With Us!");
                        repeat = true ;
                    }
                } while (payment < totalcost);
            }

        main = true;}
        }
    }
}
