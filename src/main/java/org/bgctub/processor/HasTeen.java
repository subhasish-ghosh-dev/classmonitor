package org.bgctub.processor;
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, 
return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true

*/

public class HasTeen {
    private int x;
    private int y;
    private int z;

    public HasTeen(int a, int b, int c){
        this.x=a;
        this.y=b;
        this.z=c;
    }

    public boolean  hasTeen(){
        if(this.x>12 && this.x<20){
            return true;
        }
        else if(this.y>12 && this.y<20){
            return true;
        }
        else if(this.z>12 && this.z<20){
            return true;
        }
        else{
            return false;
        }
    }


}