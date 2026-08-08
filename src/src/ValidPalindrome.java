public class ValidPalindrome {


    public static Boolean validPalindrome(String s){
        int right = s.length()-1;
        int left = 0;

        while(left<right){
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false ;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "RaceCar";
        System.out.println(validPalindrome(s));
    }


}
