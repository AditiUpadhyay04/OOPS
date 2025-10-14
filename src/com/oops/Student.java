package com.oops;

public class Student {
     int roll_Number;
     String name;
       float marks;

     Student(int roll_Number,String name,float marks) {
         this.roll_Number =  roll_Number;
         this.name = name;
         this.marks = marks;
         System.out.println(  roll_Number + name  + marks);

     }
    public static void main(String[] args){
             Student s1 = new Student(1, " Aditiii ", 292);
             Student s2 = new Student(2, " Aditi ", 1000000);






    }
}
