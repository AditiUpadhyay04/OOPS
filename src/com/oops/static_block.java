package com.oops;

// static block only execute once
//static block is executed before the main method

public class static_block {
    static int a = 6;
    static int b = 12;

    static{
        System.out.println("I'M FROM STATIC BLOCK ");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(static_block.a + " " + static_block.b);

        static_block sb = new static_block();
        System.out.println(static_block.a + " " + static_block.b);

        b = b + 3;
        a = a + 12;

        static_block sb1 = new static_block();
        System.out.println(static_block.a + " " + static_block.b);
    }

}
