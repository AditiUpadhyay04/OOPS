package com.oops;
public class Student1 {
    int rollNum;
    String name;
    String course;

    Student1(int rollNum, String name, String course){
        this.rollNum = rollNum;
        this.name = name;
        this.course = course;

    }

    public int getrollNum(){
        return rollNum;
    }
    public void setrollNum(int rollNum){
        this.rollNum = rollNum;
    }

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getcourse(){
        return course;

    }
    public void setcourse(String course){
        this.course = course;
    }

    public void displayData(){
        System.out.println("Roll Number is : " + rollNum);
        System.out.println("Name is Student is : " +name);
        System.out.println("Student of course : " +course);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(1," Aditi Upadhyay " , "Btech");
        Student1 s2 = new Student1(2, " Dhruv Rai " , "Btech");

        s1.displayData();
        s2.displayData();

        System.out.println(s2.getName());
        s2.setName("coder");
        System.out.println(s2.getName());
    }

}
