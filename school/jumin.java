import java.util.*;
class jumin{
    static boolean ju(String b){
        char a = b.charAt(7); // char a�� b�迭�� 8��° ��Ҹ� ����
        if(a == '1' || a =='3') return true; // ���ڴϱ� ''�� ����ؾߵ�
        else return false;
    }

    static String strInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("�� �� : ");
       
        return scan.nextLine();
    }

    public static void main(String[] args){
        
         if(ju(strInput())==true) System.out.println("����");
        else System.out.println("����");

    }
}