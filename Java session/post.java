public class post {
    public static void main(String[] args) {
        int a = 5;
        int b;

        b = a++;  
        System.out.println("Post-increment:");
        System.out.println("a = " + a);  
        System.out.println("b = " + b); 

        a = 5;
        b = a--;  
        System.out.println("Post-decrement:");
        System.out.println("a = " + a);  
        System.out.println("b = " + b);  
    }
}

