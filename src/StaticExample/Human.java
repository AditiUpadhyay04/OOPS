package StaticExample;
class Human1 {
    int age;
    String gender;
    String name;
    Boolean married;
    static int population;


    public Human1(int age, String gender, String name, Boolean married) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.married = married;
       Human1.population += 1;
        System.out.println("age :" +age +  "GENDER :" +gender +  "NAME :" +name +  "MARRIED :" +married );
        System.out.println("age :" +age  + "GENDER :" +gender  + "NAME :" +name   +"MARRIED :" +married );
        System.out.println("age :" +age   +"GENDER :" +gender +  "NAME :" +name   +"MARRIED :" +married );
    }
}
