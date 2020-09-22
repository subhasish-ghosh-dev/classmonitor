package org.bgctub.processor;

import java.util.*;

public class CustomerApp {

    public static void main(String[] args){
        Customer c1=new Customer("1234","rahat","1234@gmail.com");
        Customer c2=new Customer("1235","jahan","1235@gmail.com");
        Customer c3=new Customer("1236","jannat","1236@gmail.com");
        Customer c4=new Customer("1237","faria","1237@gmail.com");

        CustomerSearch cs = new CustomerSearch();
        cs.addCustomer(c1);
        cs.addCustomer(c2);
        cs.addCustomer(c3);
        cs.addCustomer(c4);

        System.out.println(cs.searchCustomerById(new Customer("1234","rahat","1234@gmail.com")).getName());
    }


}