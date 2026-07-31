public class MoveNegative {

      public static void moveNegative(int [] arr){
            int slow = 0;
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i]>0){
                    int temp = arr[i];
                    arr[i]=arr[slow];
                    arr[slow]= temp;
                    slow++;
                }
            }
      }

    public static void main(String[] args) {
        int [] arr = new int[] {3, -1, 4, -5, 2, -7, 6};
        moveNegative(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}






//[3, -1, 4, -5, 2, -7, 6]