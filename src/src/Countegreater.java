public class Countegreater {
    public static int countegreater(int [] arr){
        int maxsofar = 0; int count = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(i == 0){
                maxsofar = i;
                count++;
            } else if (arr[i]>arr[maxsofar]) {
                maxsofar = i;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = new int []{5, 1, 8, 3, 10, 6};
        System.out.println(countegreater(arr));
    }
}
