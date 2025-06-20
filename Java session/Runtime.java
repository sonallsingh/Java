class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Runtime {
    public static void main(String[] args) {
        Animal a;             // reference of type Animal

        a = new Dog();        // object of Dog
        a.sound();            // Output: Dog barks

        a = new Cat();        // object of Cat
        a.sound();            // Output: Cat meows
    }
}

