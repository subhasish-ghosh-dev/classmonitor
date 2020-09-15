package org.bgctub.processor;

public class CatDogCounter{
    public boolean catDog(String str) {
        int catcount=0;
        int dogcount=0;
        for(int i=0; i<str.length()-2; i++){
            
            System.out.println(str.substring(i,i+3));

            
            if(str.substring(i,i+3).equals("cat")){
                    catcount++;
            }
            if(str.substring(i,i+3).equals("dog")){
                    dogcount++;
            }
            
            
        }

        if(catcount==dogcount){
            return true;
        }
        else{
            return false;
        }
    }

    public int countCodes(String str) {
        int codecount=0;
        
        for(int i=0; i<str.length()-3; i++){
            
            System.out.println(str.substring(i,i+4));
            System.out.println(str.substring(i,i+2));
            System.out.println(str.substring(i+3,i+4));
            if(str.substring(i,i+2).equals("co")&&(str.substring(i+3,i+4).equals("e"))){
                    codecount++;
            }          
            
        }
        System.out.println(codecount);
        return codecount;
    }


    public static void main(String[] args){
        CatDogCounter c = new CatDogCounter();
        //c.catDog("catdoggggggggg");
        c.countCodes("codexxcode");
    }

}