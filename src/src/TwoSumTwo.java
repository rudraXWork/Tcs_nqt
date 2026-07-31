import java.util.Arrays;

public class TwoSumTwo {

    public static int [] twosum2(int [] arr){
        int start = 0;
        int end = arr.length -1;
        int target = 9;
        while(start<end){
            if(arr[start] + arr[end] == target ){
                return new int[]{start , end };
            } else if (arr[start] + arr[end] > target) {
                end--;
            }else {
                start++;
            }

        }

        return new int[] {-1, -1 };

    }

    public static void main(String[] args) {
        int [] arr = new int[] {2, 7, 11, 15};
        System.out.print(Arrays.toString(twosum2(arr)));
    }
}
