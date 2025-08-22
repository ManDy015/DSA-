package _1_patterns;

public class patern2 {
    public static void pattern10(int n){
        for(int i = 0; i <= 2*n-1; i++){
            int stars = i;
            if( i > n){
                stars = 2*n-i;
            }
            for(int j =1; j <=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        int start = 1;
        for(int i = 0 ; i < n; i++){
            if(i % 2 == 0){
                start = 1;
            }
            else{
                start = 0;
            }
            for(int j = 0; j <= i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        int space = 2*(n-1);
        for(int i = 1; i <= n; i++){
            //number
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            //space
            for(int j = 1 ; j <= space; j++){
                System.out.print(" ");
            }
            //number
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            space = space -2;

        }
    }
    public static void pattern13(int n){
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j =1; j <= i; j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for( int i = 0; i < n; i++){
            for(char ch = 'A'; ch <= 'A' + i ; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        for( int i = 0; i < n ; i++){
            for(char ch = 'A'; ch <= 'A'+ (n-i-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for(int i = 0; i < n; i++){
            char ch = (char)('A' + i) ;
            for(int j = 0; j <= i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){

        for(int i  =0; i < n; i++){
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            //space
            for(int j = 0; j <= n-i-1; j++){
                System.out.print(" ");
            }
            //character
            for(int j = 1; j <= 2*i+1; j++){
                System.out.print(ch);
                if(j <= breakpoint){
                    ch++;
                }
                else ch-- ;
            }
            //space
            for(int j = 0; j <= n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void pattern19(int n){
        System.out.println("pattern19");
        int space = 0;
        for(int i = 0; i < n; i ++){

            //symbol
            for(int j = 1; j <= n-i; j++){
                System.out.print("*");
            }

            //space
            for(int j = 0; j < space ; j++){
                System.out.print(" ");

            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("*");
            }
            space +=2;
            System.out.println();
        }
        space = 8;
        for(int i = 0 ; i < n; i++){
            //symbol
            for(int j = 1; j <= i+1; j++){
                System.out.print("*");
            }
            //space
            for(int j = space; j > 0; j--){
                System.out.print(" ");
            }
            //symbol
            for(int j = 1; j <= i+1; j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
    }
public static void pattern20(int n){
    int space = 2*n-2;
    for(int i=1 ; i <= 2*n-1; i++) {
        int stars = i;
        if(i > n)  stars = 2*n-i;
        //stars
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }
        //space
        for (int j = 1; j <= space ; j++) {
            System.out.print(" ");
        }
        //stars
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }
        System.out.println();
        if(i < n) space -=2;
        else space +=2;
        }
    }
    public static void pattern21(int n){
       for( int i = 0; i < n; i++){
           //outer *
           for(int j = 0 ; j < n; j++){
               if(i == 0 || i == n-1 || j== 0 || j== n-1){
                   System.out.print("*");
               }
               else
                   System.out.print(" ");
           }
           System.out.println();
       }
    }


    public static void main(String[] args) {
        int n = 5;
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
        pattern18(n);
        pattern19(n);
        pattern20(n);
        pattern21(n);
    }
}
