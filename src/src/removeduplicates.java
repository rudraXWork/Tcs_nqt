public class removeduplicates {

    public static int Removeduplicates(int [] arr){
        if(arr.length == 0) return 0;
        int slow = 0;
        for(int fast = 1 ; fast< arr.length ; fast++){
            if(arr[slow] != arr[fast] ){
                slow++;
                arr[slow] = arr[fast];
            }
        }

        return slow +1 ;
    }
    public static void main(String[] args) {
        int [] arr = new int []{0, 0, 1, 1, 1, 2, 3, 3};
        System.out.println(Removeduplicates(arr));
    }

}


//Problem: sorted array, remove duplicates in-place, return new length. Array: pick your own or use [0, 0, 1, 1, 1, 2, 3, 3].