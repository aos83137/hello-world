import java.util.*;

class J70P_Q7{
    static int convR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf("%2dㅣ      %2d%n",r,x);
        do{
            d[digits++] = dchar.charAt(x%r);
            if(x>1) {
                System.out.printf("   ---------%n");
                System.out.printf("%2dㅣ      %2d --- %d%n",r,x/r,x%r);
            }else{
                System.out.printf("   ---------%n");
                System.out.printf("  ㅣ      %2d --- %d%n",x/r,x%r);
            }
            
            x/=r;           
        }while(x!=0);
        for(int i=0;i<digits/2;i++){
            char tmp = d[i]; d[i] = d[digits-i-1] ; d[digits-i-1] = tmp;
        } //배열 역순 저장
        return digits; 
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int no; //변환하는 정수
        int cd; //기수
        int dno; //변환 후의 자릿수
        int retry; //다시 한번
        char[] cno = new char[32];  //변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수 변환합니다.");
        do{
            do{
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = scan.nextInt();
            }while(no<0);

            do{
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = scan.nextInt();
            }while(cd<2 || cd>36);

            dno = convR(no,cd,cno);

            System.out.print(cd + "진수로는 ");
            for(int i = 0;i<dno;i++){//윗자리부터 차례로 출력
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");
    
            System.out.print("한번더 할까요? (1. 예/ 0.아니오) : ");
            retry = scan.nextInt();
        }while(retry != 0);
    }
}