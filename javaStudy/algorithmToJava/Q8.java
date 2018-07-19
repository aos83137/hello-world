import java.util.*;
class Q8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum=0;  
        System.out.print("정수 입력");
        int n;
        n = scan.nextInt();

        sum = n*(n+1)/2;  // 가우스 덧셈 이용

        System.out.printf("1~%d 의 합은 : %d", n, sum);

    }
} 
