package com.oops;

public class InnerClass {
    class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
       InnerClass obj = new InnerClass();
        InnerClass.Test T1 =obj.new Test("Aditi");
        InnerClass.Test T2 =obj.new Test("Anubhav");


        System.out.println(T1.name);
        System.out.println(T2.name);

    }
}
