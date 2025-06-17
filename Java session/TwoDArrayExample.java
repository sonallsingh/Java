public class TwoDArrayExample {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie"};
        int[][] marks = {
            {85, 90, 88},   // Alice
            {75, 80, 78},   // Bob
            {92, 89, 95}    // Charlie
        };

        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(students[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}

