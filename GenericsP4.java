public class GenericsP4 {
    public static void main(String[] args) {
        //work with Animal,Dog&Fish
        General<Animal> b1 = new General<>();
        General<Dog> b2 = new General<>();
        General<Fish> b3 = new General<>();

        // work with only Fish
        General2<Fish> f1 = new General2<>();
        // General2<Animal> f2 = new General2<>() // give compile error

    }
    

}

class General<T extends Animal>{
 // work with Dog and Fish
    T value;
}

class General2<T extends Animal & Swimmable>{
    // work only with Fish 
    T value;
}

class Animal{
    void display(){
        System.out.println("Animal Displaying");
    }
}

interface Swimmable{
    void swim();
}

class Dog extends Animal{

}

class Fish extends Animal implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Fish swimming");
    }
}


// Syntax

// <T extends Class & interface1, interface2, interface3 ... >