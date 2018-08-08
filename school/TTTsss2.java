import haksa.Person;
import haksa.Student;
import haksa.Teacher;

class TTTsss2{

    public static void print(Person p){
        if(p instanceof Student){                               //p 형이 Student인지 확인
            System.out.println("학생입니다.");
            System.out.println("-------------------");
            System.out.println("이름 : " + p.getName());
            System.out.println("폰 : " + p.getPhone());

            Student s = (Student)p;
            System.out.println("sabun : " + s.hakbun);
            System.out.println("depart : " + s.grade);
            System.out.println("salary : " + s.score);
        }else if(p instanceof Teacher){
            System.out.println("선생입니다.");
            System.out.println("-------------------");
            System.out.println("이름 : " + p.getName());
            System.out.println("폰 : " + p.getPhone());

            Teacher t = (Teacher)p;
            System.out.println("sabun : " + t.getSabun());
            System.out.println("depart : " + t.getDepart());
            System.out.println("salary : " + t.getSalary());
        }

    }

    public static void main(String[] args){
        Person p = new Student("이순신", "010-1234-5678","1235", 1, 4.5);  

        print(p);

        p = new Teacher("장길산", "010-7897-5412", "123456" ,"컴정" , 1000);

        print(p);

    }
}