public class MoveZerostoEnd {
    public static void moveZeroes(int[] arr) {

        int j = 0; // Position where the next non-zero element should go

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 0, 1, 9, 0, 5, 0};

        moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
