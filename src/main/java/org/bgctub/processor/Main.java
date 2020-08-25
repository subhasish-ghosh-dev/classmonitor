package org.bgctub.processor;

public class Main {
    public static void main(String[] args){
        HasTeen hasObj =new HasTeen(9,10,11);
        boolean result = hasObj.hasTeen();
        System.out.println("RESULT: " + result);
        String lastName="Ghosh";
        String firstName="Subhasish";
        //String fullName=lastName + " " +firstName;
        String fullName=firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
    }
}