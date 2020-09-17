package org.bgctub.processor;

import java.util.Scanner;

public class EveryNth {

    private int N;
    private String str;

    public EveryNth(String s, int n){
        this.N = n;
        this.str = s;
    }

    public String everynth(String str, int n) {
        String sub = "";
        sub= sub.concat(String.valueOf(str.charAt(0)));
        //sub=sub.concat(String.valueOf(str.charAt(n)));
        int nth=1;
        int idx = n;
        while(idx<str.length()){
            
            sub=sub.concat(String.valueOf(str.charAt(idx)));
            idx = ++nth*n;
            
        }
        
        return sub;
  
    }
 
    public static void main(String[] args){
        EveryNth obj = new EveryNth("Miracl", 2);
        String result =  obj.everynth(obj.str, obj.N);
        System.out.println(result);

    }
}