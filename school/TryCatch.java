import java.util.*;

class TryCatch{
    public static void main(String[] args){
        int[] a = new int[3];
        int i;
        Scanner scan = new Scanner(System.in);

        i = scan.nextInt();

        try{
        a[1] = 5;
        System.out.println(a[i]);
        }
        catch( Exception e){
            System.out.println("�迭 ������ ������ϴ�..");
            System.out.println(e.toString());
        }
        finally{
            System.out.println("���ܻ����� �߻��ϵ� ���ϵ� �����");
        }
    }
}