import java.util.*;
class Q8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum=0;  
        System.out.print("���� �Է�");
        int n;
        n = scan.nextInt();

        sum = n*(n+1)/2;  // ���콺 ���� �̿�

        System.out.printf("1~%d �� ���� : %d", n, sum);

    }
}