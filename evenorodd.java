public class evenorodd {
    public static void checkEvenOdd(int n){
        if(n % 2 == 0){
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args) {
        checkEvenOdd(5);
        checkEvenOdd(10);
    }
}
