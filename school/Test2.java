import java.io.*;

class Test2{
    public static void main(String[] args){
        try{
            FileReader f = new FileReader("c:\\employee.txt");
            BufferedReader fr = new BufferedReader(f);
            String str;
            while(true) {
                str = fr.readLine();
                if(str == null) break;
                System.out.println(str);
            }
        }       
        catch(IOException e){
            System.out.println("���� �Ǵ� ������ ã���� ����");
        }

        System.out.println("Hello world!");
    }
}