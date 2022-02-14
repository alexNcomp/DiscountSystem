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
public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    @Override
    public String toString() {
        return "Visit{" + "customer=" + customer.getName() + ", date=" + date + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + '}';
    }
    
    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    
    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }
}
