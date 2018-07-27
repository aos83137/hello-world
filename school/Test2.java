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
            System.out.println("파일 또는 폴더를 찾을수 없다");
        }

        System.out.println("Hello world!");
    }
}