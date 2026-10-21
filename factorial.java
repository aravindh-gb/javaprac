public class factorial {
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return -1;
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(5));
    }
    
}
