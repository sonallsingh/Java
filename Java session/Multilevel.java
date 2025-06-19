// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

// Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

// Main class
public class Multilevel {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();

        myPuppy.eat();   // from Animal
        myPuppy.bark();  // from Dog
        myPuppy.weep();  // from Puppy
    }
}
