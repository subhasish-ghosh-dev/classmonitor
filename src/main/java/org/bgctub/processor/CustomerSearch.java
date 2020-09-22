package org.bgctub.processor;

import java.util.*;

public class CustomerSearch {
    private List<Customer> customers;

    public CustomerSearch(){
        this.customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    public List<Customer> getCustomers(){
        return this.customers;
    }

    public Customer searchCustomerById(){
        
    }

} 