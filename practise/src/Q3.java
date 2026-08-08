public class Q3 {

    public static int[] countTypes(int[] arr) {
        int Positive = 0 , Negative = 0 , Zero = 0;
       for(int num : arr){
           if(num<0){
               Negative++;
           } else if (num==0) {
               Zero++;
           }else{
               Positive++;
           }
       }

       return new int []{Positive  , Negative  , Zero };
    }

    public static void main(String[] args) {
        int[] arr = {-3, 0, 2, -1, 5, 0, -9, 4};
        int[] result = countTypes(arr);
        System.out.println("Positive: " + result[0] + ", Negative: " + result[1] + ", Zero: " + result[2]);
        // Expected Output: Positive: 3, Negative: 3, Zero: 2
    }
}
