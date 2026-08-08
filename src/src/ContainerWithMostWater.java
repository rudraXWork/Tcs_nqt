public class ContainerWithMostWater {

    public static int MostWater(int [] arr){
        int max = 0 ;
        int left = 0;  int right = arr.length-1;
        while(left<right){
            int width = right - left ;
            int currentHeight = Math.min(arr[left], arr[right]);
            int currentArea = width * currentHeight;
            max = Math.max(max, currentArea);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
