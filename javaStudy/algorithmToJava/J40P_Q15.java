import java.util.*;

class J40P_Q15{
    static void triangleLB(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)   
                System.out.print("*");
            System.out.println();
        }
    }
    
    static void triangleLU(int n){
        for(int i=0;i<n;i++){
            for(int j=0;i+j<n;j++)   
                System.out.print("*");
            System.out.println();
        }    
    }

    static void triangleRU(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)   
                if(j>=i)
                System.out.print("*");
                else System.out.print(" ");
            System.out.println();
        }
    }//
    
    static void triangleRB(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)   
                if(i+j>=n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        triangleLB(n);
        System.out.println();
        triangleLU(n);
        System.out.println();
        triangleRB(n);
        System.out.println();
        triangleRU(n);
        System.out.println();
        


    }
}
