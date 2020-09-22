package org.bgctub.processor;

public class Customer {
    private String code;
    private String name;
    private String email;

    public Customer(String c, String n, String e){
        this.code=c;
        this.name=n;
        this.email=e;
    }

    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }


}