/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meal;
import java.util.Scanner;

/**
 *
 * @author wdole
 */
public class Meal {
    
    double mealPrice;
    int tipAmount, tax;
    
    public Meal() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("What was the total of the meal's bill?");
            mealPrice = sc.nextDouble();
            System.out.println("What percent would you like to tip?");
            tipAmount = sc.nextInt();
            System.out.println("What is your state's tax rate?");
            tax = sc.nextInt();
        }
    }
    
    public int totalPrice() {
        final double percent = 100.0;
        double tipTotal = mealPrice * (tipAmount/percent);
        double taxTotal = mealPrice * (tax/percent);
        return (int) Math.round(mealPrice + tipTotal + taxTotal);
    }
    
    public static void main(String[] args) {
        Meal current = new Meal();
        System.out.println("The final price of the meal is $" + current.totalPrice() + ".");
    }
    
}
