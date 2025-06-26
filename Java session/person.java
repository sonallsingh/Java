// Encapsulation Example in Java
public class person {
    // Private data members (data hiding)
    private String name;
    private int age;

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String newName) {
        name = newName;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age with validation
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        // Create object of Person
        person p1 = new person();

        // Set values using setters
        p1.setName("Sonal");
        p1.setAge(18);

        // Get values using getters
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}
