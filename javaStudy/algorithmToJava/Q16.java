import java.util.*;
class Q16{
    static void spira(int n)
    {
        int i;
        for(i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int s=scan.nextInt();
        spira(s);

    }
}