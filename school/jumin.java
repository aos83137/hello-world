import java.util.*;
class jumin{
    static boolean ju(String b){
        char a = b.charAt(7); // char a는 b배열의 8번째 요소를 저장
        if(a == '1' || a =='3') return true; // 문자니까 ''를 사용해야됨
        else return false;
    }

    static String strInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("입 력 : ");
       
        return scan.nextLine();
    }

    public static void main(String[] args){
        
         if(ju(strInput())==true) System.out.println("남자");
        else System.out.println("여자");

    }
}