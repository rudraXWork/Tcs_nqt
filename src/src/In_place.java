import java.util.*;

public class In_place {

    public static int[] countofnotype(int [] arr){
        int positives =0 ; int negatives = 0; int zeros= 0 ;
        for(int num : arr){
            if(num > 0){
                positives++;
            } else if (num < 0) {
                negatives++;
            } else if (num == 0) {
                zeros++;
            }
            }
        return new int [] {positives,negatives,zeros};
    }

    public static void main(String[] args) {
        int [] arr = new int []{-3, 0, 2, -1, 5, 0, -9, 4};
        System.out.println(Arrays.toString(countofnotype( arr)));
    }
}
