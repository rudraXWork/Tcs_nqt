public class Q5 {

    public static int countGreater(int[] arr) {
        // write your code here
        int maxSoFar = arr[0];
        int count = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxSoFar) {
                maxSoFar = arr[i];
                count++;
            }
        }
        return count;


    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 3, 10, 6};
        System.out.println(countGreater(arr));
        // Expected Output: 3
    }
}