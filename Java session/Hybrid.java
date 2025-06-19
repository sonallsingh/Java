interface A {
    void methodA();
}

class B {
    void methodB() {
        System.out.println("Method B");
    }
}

class C extends B implements A {
    public void methodA() {
        System.out.println("Method A");
    }

    void methodC() {
        System.out.println("Method C");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();  // from Interface A
        obj.methodB();  // from Class B
        obj.methodC();  // own method
    }
}

