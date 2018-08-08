import haksa.Person;
import haksa.Student;
import haksa.Teacher;

class TTTsss{
    public static void main(String[] args){
        Person p;
        p = new Student("이순신", "010-1234-5678","1235", 1, 4.5);
        p.show();
        System.out.println();
        p = new Teacher("장길산", "010-7897-5412", "123456" ,"컴정" , 1000);
        p.show();

    }
}