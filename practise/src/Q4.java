public class Q4 {

    public static void moveZeros(int[] arr) {
        int slow = 0 ;
        for( int fast = 0 ; fast <arr.length ; fast++){
            if(arr[fast]!=0){

                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow]= temp;

                slow++;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 0, 1, 9, 0, 5, 0};
        moveZeros(arr);
        for(int num : arr) System.out.print(num + " ");
        // Expected Output: 4 5 1 9 5 0 0 0
    }
}