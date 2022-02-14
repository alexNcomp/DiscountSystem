// --------------------------------------------------------------------
// Assignment 1
// Written by: Alex Nguyen #2073215
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
package discountsystem;

import java.util.Date;

/**
 *
 * @author Alex
 */
public class Main {
    
    public static void main(String[] args) {
        // Create customer and set her as a member.
        Customer c = new Customer("Amelia");
        c.setMember(true); c.setMemberType("Gold");
        
        // Make her visit and set the expenses.
        Visit v = new Visit(c.getName(), new Date());
        v.setProductExpense(31.14); v.setServiceExpense(74.51);
        
        // Get the total expenses for Amelia.
        
        // Getting the discounts.
        String type = c.getMemberType();
        double productDiscount = DiscountRate.getProductDiscountRate(type);
        double serviceDiscount = DiscountRate.getServiceDiscountRate(type);
        
        // Applying the discount to the base price.
        v.setProductExpense(v.getProductExpense() / (1 + productDiscount));
        v.setServiceExpense(v.getServiceExpense() / (1 + serviceDiscount));
        
        // Getting the total expenses.
        double total = v.getTotalExpense();
        System.out.printf("Total price: $%.2f\n", total);
    }
}
