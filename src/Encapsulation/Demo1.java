package Encapsulation;

public class Demo1 {
  protected int num;
    String name;

    public Demo1(){
        this.num = 123;
    }

    public Demo1(int num, String name){
        this.num = num;
        this.name = name;
    }
   void setNum(int num){
    this.num = num;

    }
    int getNum(){
        return this.num;

    }

   void display(){
        System.out.println(this.num);
        System.out.println(this.name);
    }

}
