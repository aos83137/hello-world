import haksa.Person;
import haksa.Student;
import haksa.Teacher;

class TTTsss2{

    public static void print(Person p){
        if(p instanceof Student){                               //p 형이 Student인지 확인
            System.out.println("학생입니다.");
        }else if(p instanceof Teacher){
            System.out.println("선생입니다.");
        }

    }

    public static void main(String[] args){
        Person p = new Student("이순신", "010-1234-5678","1235", 1, 4.5);  

        print(p);

        p = new Teacher("장길산", "010-7897-5412", "123456" ,"컴정" , 1000);

        print(p);

    }
}