public class DrinkWater {
    public static void main(String[] args) {
        int sipsLeft = 3; 
        // Number of sips needed to empty the glass

        do {
            System.out.println("Taking a sip...");
            sipsLeft--; 
            // After each sip, one less remains
        } while (sipsLeft > 0);

        System.out.println("The glass is empty.");
    }
}


