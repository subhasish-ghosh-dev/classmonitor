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

    public Customer searchCustomerById(Customer customerObj){
       
        Comparator<Customer> c = new Comparator<Customer>() {
            public int compare(Customer c1, Customer c2){
               return c1.getCode().compareTo(c2.getCode());
            }
        };

        final int idx = Collections.binarySearch(this.customers, customerObj, c);
        return this.customers.get(idx);
    }

} 