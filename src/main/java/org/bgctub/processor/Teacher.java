package org.bgctub.processor;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Teacher{
    //Instance variables
    private String fullName;
    Student st;
    private String code;
    private String[] courseCodes;
    private List<Integer>/*Generic*/ studentRollNo;//Wrapper type will be used in Generic

    public Teacher(){

    }

    public Teacher(/*Local Variables*/String fn, String cd, String[] codes, List<String> studentRollNo){
        

    }

    public void display(){
        System.out.println("Teacher's Name: "+this.fullName);
        System.out.println("Teacher's Code Name: "+this.code);
        int count=0;
        for(String cnt: this.courseCodes){
            if(cnt!=null && !cnt.isEmpty()){
                count++;
            }
            //String s = null;
        }
        System.out.println("Teacher's Number of Courses: "+count);
        System.out.println("Teacher's Number of Students: "+this.studentRollNo.size());
    }

    public static void main(String[] args){
        
        Teacher tc = new Teacher();
        
        tc.courseCodes = new String[5];
        tc.studentRollNo = new ArrayList<Integer>();
        
        tc.fullName="Subhasish Ghosh";
        tc.code="SG";
        
        tc.courseCodes[0]="CSE 2104";
        tc.courseCodes[1]="CSE 2109";

        tc.studentRollNo.add(1933032);
        tc.studentRollNo.add(1933003);
        tc.studentRollNo.add(1933018);
        tc.studentRollNo.add(1933031);
        tc.studentRollNo.add(1933014);
        tc.studentRollNo.add(1932155);
        tc.studentRollNo.add(1933027);

        tc.display();
    }
}