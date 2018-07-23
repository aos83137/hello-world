import java.util.*;
class JP30_Q9{
    static int sumof(int a, int b){
        if(a>b){
            int t = a; a = b; b = t;
        }
        
        int sum =0;
        for(int i=a;i<=b;i++){
            sum += i;
        }

        return sum;
    }   
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 입력1 :" );
        int a = scan.nextInt();
        System.out.print("정수 입력2 :" );
        int b = scan.nextInt();

        int sum = sumof(a,b);
        System.out.printf("%2d~%2d 사이의 정수합은 %d",a,b,sum);
    }
}
