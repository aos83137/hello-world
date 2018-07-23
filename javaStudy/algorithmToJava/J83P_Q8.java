import java.util.*;

class J83P_Q8{
    static int[][] mdays ={
        {31,28,31,30,31,30,31,31,30,31,30,31}, //���
        {31,29,31,30,31,30,31,31,30,31,30,31}  //����
    };

    static int isLeap(int year){
        return (year % 4==0 && year % 100 !=0 || year %400 ==0) ? 1:0;
    }//���� 1 /��� 0

    static int dayOfYear(int y, int m, int d){ 
        while(m-1>0){
            d+=mdays[isLeap(y)][m-2];
            m--;
        }
        return d;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
        int retry = 0;
        do{
            System.out.print("��");
            int year = scan.nextInt();
            System.out.print("��");
            int month = scan.nextInt();
            System.out.print("��");
            int day = scan.nextInt();

            System.out.printf("�� �� %d��°�Դϴ�.%n",dayOfYear(year, month, day));

            System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) : ");
            retry = scan.nextInt();
        }while(retry == 1);
    }
}