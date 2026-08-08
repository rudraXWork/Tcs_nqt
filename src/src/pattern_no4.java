public class pattern_no4 {
    public static void main(String[] args) {
        int n = 5 ;
        for(int i = 1 ; i<=n ; i++){
            if(i==1){
                for (int j = i; j <=n; j++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            } else if (i==n){

                for(int z = i ; z>=1 ; z--){
                    System.out.print("*"+" ");
                }

            } else {
                int space = n*2-3;
                for(int k = i ; k<=i; k++) System.out.print("*");
                for(int l = 1 ; l<=space; l++) System.out.print(" ");
                for(int m = n ; m<=n; m++) System.out.print("*");
                System.out.println();
            }

            }
        }
    }

