package _1_patterns;

public class pattern1 {
    public static void pattern1(int n)
    {
        for(int i = 0; i < n; i++){
            for( int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }



    public static void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i = 0; i < n; i++){
            for( int j = 1; j <= i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for( int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i+1;j++){
                System.out.print(j );
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for( int i = 0; i < n; i++){
            //space
            for( int j = 0; j <n-i-1;j++ ){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j <= i*2+1 ;j++){
                System.out.print("*");
            }
            //space
            for(int j= 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n) {
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int r = 0; r < 2*n ; r++)
        {
            for(int i = 0; i < n/2; i++)
            {
                for(int j = 0; j < n/2 - r - 1; j++){
                    System.out.print(" ");
                }
                for( int j = 0; j < 2*i+1; j++){
                    System.out.print("*");
                }
                for(int j = 0; j < 2*n - 1; j++  ){
                    System.out.print(" ");
                }
                System.out.println();
            }

            for(int i = n/2; i < n; i++){
                for(int j = 0; j < i; j ++){
                    System.out.print(" ");
                }
                for( int j = 0; j < 2*n-(2*i+1); j++){
                    System.out.print("*");
                }
                for(int j = 0 ; j < i; j++){
                    System.out.println(" ");
                }
                System.out.println();
            }


        }

    }
 public static void main(String[] args){int n = 5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);

}
}