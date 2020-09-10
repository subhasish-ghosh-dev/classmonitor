package org.bgctub.processor;
public class CountHi {
    public static int countHi(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++){
            int idx=str.indexOf("hi");            
            if(idx>=0) {
                count+=1;
                str = str.substring(idx+1);                
            }
        }
        return count;
    }


    public static void main(String[] args){
        System.out.println( countHi("abc hi hi"));
    }
}