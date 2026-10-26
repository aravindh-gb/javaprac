public class small {
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 2, 15};

        System.out.println("Smallest element: " + findMin(arr));
    }
    
}
