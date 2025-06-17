public class plus {
    public static void main(String[] args) {
        int a = 5;
        int b;

        // Pre-increment
        b = ++a;
        System.out.println("Pre-increment: a = " + a + ", b = " + b); // a = 6, b = 6

        a = 5; // reset a
        // Post-increment
        b = a++;
        System.out.println("Post-increment: a = " + a + ", b = " + b); // a = 6, b = 5

        a = 5; // reset a
        // Pre-decrement
        b = --a;
        System.out.println("Pre-decrement: a = " + a + ", b = " + b); // a = 4, b = 4

        a = 5; // reset a
        // Post-decrement
        b = a--;
        System.out.println("Post-decrement: a = " + a + ", b = " + b); // a = 4, b = 5
    }
}

