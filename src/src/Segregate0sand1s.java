

public class Segregate0sand1s{

    public static void segregate0sand1s(int [] arr){
        int slow = 0 ;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]!=1){
              int temp = arr[i];
              arr[i]=arr[slow];
              arr[slow] = temp;
                slow++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[]{0, 1, 0, 1, 1, 0, 0, 1};
        segregate0sand1s(arr);
        for(int nums : arr) System.out.print(nums+ " ");
    }
    }


