
public class Q1 {

    public static int[] firstAndSecond(int[] arr) {
        // write your code here
        int first = Integer.MIN_VALUE , second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>first){
               second = first ;
               first = num;
            } else if (num > second &&  num != first) {

                second = num;
            }
        }
        return new int []{first, second };
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int[] result = firstAndSecond(arr);
        System.out.println("First: " + result[0] + ", Second: " + result[1]);
        // Expected Output: First: 35, Second: 34
    }
}
