import java.util.*;



public class SecondLargestNo {
    public static int secondlargest(int [] arr){
         
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int a : arr){
            if(a > first){
                second = first ;
                first = a ;
            } else if (a> second && a!= first) {
                second = a;
            }


        }
        return second ;
        }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest: " + secondlargest(arr));
    }
}
