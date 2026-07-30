import java.util.*;

public class secondandfirstlargestno {

    public static int []  FirstSecond(int [] arr){
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
        return new int[]{first , second} ;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("first and second number are  " + Arrays.toString( FirstSecond( arr)) );
    }
}
