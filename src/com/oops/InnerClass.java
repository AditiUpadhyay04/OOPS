package com.oops;

public class InnerClass {
   static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test T1 = new Test("Aditi");
        Test T2 = new Test("Anubhav");


        System.out.println(T1.name);
        System.out.println(T2.name);

    }
}
