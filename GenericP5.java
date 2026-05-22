import java.util.List;
import java.util.ArrayList;
class GenericP5{
    public static void main(String[] args){
        // Generic invarient
        Animals a = new Dog();
        a.eat();
        a.walk();
        // a.bark(); // not allowed

        // not allowed
        // List<Dog> dogs = new ArrayList<>();
        // List<Animals> animals = dogs;

        Dog[] d = new Dog[10];
        Animals[] ani = d;

        ani[2] = new Animals();
        for(Animals an : ani){
            an.eat(); //Exception in thread "main" java.lang.ArrayStoreException: Animals
        }
    }
}

class Animals{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Animals{
    void bark(){
        System.out.println("Barking");
    }
}