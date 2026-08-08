public class pattern_no3 {
    public static void main(String[] args) {
        int n = 4 ;
        for(int i = 1 ; i<=n ; i++){
            int space = n-i ;
            int count = 2*i-1;
            for(int j = 1 ; j<=space ; j++ ) System.out.print(" ");
            for (int k = 1; k <= count  ; k++) System.out.print("*");
            System.out.println();
        }
        for(int i = n-1 ; i>=1 ; i--){
            int space = n-i ;
            int count = 2*i-1;
            for(int j = 1 ; j<=space ; j++ ) System.out.print(" ");
            for (int k = 1; k <= count  ; k++) System.out.print("*");
            System.out.println();
        }
    }
}
