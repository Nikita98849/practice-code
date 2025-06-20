package JavaFullStack;

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();    
        myDog.sleep();  
        myDog.bark();  
    }
}
