public class maximumele {
    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 8, 15};

        System.out.println("Maximum element: " + findMax(arr));
    }
}
