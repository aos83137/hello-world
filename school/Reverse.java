import java.util.*;

class Reverse{
    static String Rever(String s){
        String s2 = ""; // String 초기화 

        for(int i=s.length()-1;i>=0;i--)
            s2 += s.charAt(i);

            return s2;
    }
    
    static String strInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("입 력 : ");
      
        return  scan.nextLine();
    }


    public static void main(String[] args){

        String str = strInput();
        System.out.println("거꾸로 : " + Rever(str));
    }
}


// ex 입력 : abc
// i: 2
// s2 = "c"
// i: 1
// s2 = "c" + 'b' = "cb"
