package org.bgctub.processor;

/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/
import java.util.Scanner;


public class StringSplosion {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING: \n");
        String word = sc.next();
        String result="";
        /*for(int i=0; i<word.length(); i++){
            System.out.println("INDEX NO "+ i + " : "+ word.charAt(i));
        }*/
        //for(int i=0; i<=word.length()-1; i++){
        for(int i=0; i<=word.length(); i++){
            String s = word.substring(0,i);
            result=result.concat(s);

        }
        //result=result.concat(word);
        System.out.println(result);
        //System.out.println(word.substring(2));
        //System.out.println(word.substring(0,2));
        sc.close();
    }
    
}