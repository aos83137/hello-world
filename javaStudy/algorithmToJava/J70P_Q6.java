import java.util.*;

class J70P_Q6{
    static int convR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x%r);
            x/=r;           
        }while(x!=0);

        for(int i=0;i<digits/2;i++){
            char tmp = d[i]; d[i] = d[digits-i-1] ; d[digits-i-1] = tmp;
        }
        return digits; 
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int no; //��ȯ�ϴ� ����
        int cd; //���
        int dno; //��ȯ ���� �ڸ���
        int retry; //�ٽ� �ѹ�
        char[] cno = new char[32];  //��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭

        System.out.println("10������ ��� ��ȯ�մϴ�.");
        do{
            do{
                System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
                no = scan.nextInt();
            }while(no<0);

            do{
                System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
                cd = scan.nextInt();
            }while(cd<2 || cd>36);

            dno = convR(no,cd,cno);

            System.out.print(cd + "�����δ� ");
            for(int i = 0;i<dno;i++){//���ڸ����� ���ʷ� ���
                System.out.print(cno[i]);
            }
            System.out.println("�Դϴ�.");
    
            System.out.print("�ѹ��� �ұ��? (1. ��/ 0.�ƴϿ�) : ");
            retry = scan.nextInt();
        }while(retry != 0);
    }
}