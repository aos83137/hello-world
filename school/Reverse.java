import java.util.*;

class Reverse{
    static String Rever(String s){
        String s2 = ""; // String 초기화 

        for(int i=s.length()-1;i>=0;i--)
            s2 += s.charAt(i);

            return s2;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("입 력 : ");
        String str = scan.nextLine();
        System.out.println("거꾸로 : " + Rever(str));
    }
}


// ex 입력 : abc
// i: 2
// s2 = "c"
// i: 1
// s2 = "c" + 'b' = "cb"
