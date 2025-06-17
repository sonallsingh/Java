public class While {
    public static void main(String[] args) {
        int bottle = 0;
        int capacity = 5;

        while (bottle < capacity) {
            bottle++;
            System.out.println("Filled unit " + bottle);
        }
    }
}
