package Inheritance;
// Parent class
    class Animal {
        void eat() {
            System.out.println("Animals can eat");
        }
    }

    // Child class inheriting from Animal
    class Dog extends Animal {
        void bark() {
            System.out.println("Dogs can bark");
        }
    }

    public class InheritanceExample {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.eat();   // Inherited method from Animal
            d.bark();  // Own method of Dog
        }
    }


