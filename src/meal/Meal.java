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
    double tipAmount, tax;
    
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
        final int percent = 100;
        final int plusPercent = 1;
        return (int) Math.round(mealPrice*(plusPercent+(tipAmount/percent))*(plusPercent+(tax/percent)));
    }
    
    public static void main(String[] args) {
        Meal current = new Meal();
        System.out.println("Your meal's total comes to $" + current.totalPrice() + " after tip and tax.");
    }
    
}
