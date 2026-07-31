
import java.util.List;

public class RemoveElement {

    public static int RemoveElement(int [] arr){
        int slow = 0;
        int target = 3;
        for(int i = 0 ; i < arr.length; i++){
            if( arr[i] != target){
                arr[slow] = arr[i];
                slow++;
            }
        }

        return slow ;
    }
}

//Input: arr = [3, 2, 2, 3, 5, 3], target = 3