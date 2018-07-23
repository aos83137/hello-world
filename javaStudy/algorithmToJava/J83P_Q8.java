import java.util.*;

class J83P_Q8{
    static int[][] mdays ={
        {31,28,31,30,31,30,31,31,30,31,30,31}, //평년
        {31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
    };

    static int isLeap(int year){
        return (year % 4==0 && year % 100 !=0 || year %400 ==0) ? 1:0;
    }//윤년 1 /평년 0

    static int dayOfYear(int y, int m, int d){ 
        while(--m>0){                           //전꺼 보다 이게 더 
            d+=mdays[isLeap(y)][m-2];
        }
        return d;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("그 해 경과 일수를 구합니다.");
        int retry = 0;
        do{
            System.out.print("년");
            int year = scan.nextInt();
            System.out.print("월");
            int month = scan.nextInt();
            System.out.print("일");
            int day = scan.nextInt();

            System.out.printf("그 해 %d일째입니다.%n",dayOfYear(year, month, day));

            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = scan.nextInt();
        }while(retry == 1);
    }
}
