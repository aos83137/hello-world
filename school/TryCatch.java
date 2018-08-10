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
            System.out.println("배열 범위를 벗어났습니다..");
            System.out.println(e.toString());
        }
        finally{
            System.out.println("예외사항이 발생하든 안하든 실행됨");
        }
    }
}