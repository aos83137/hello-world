import haksa.Person;
import haksa.Student;
import haksa.Teacher;

class TTTsss{
    public static void main(String[] args){
        Person p;
        p = new Student("이순신", "010-1234-5678","1235", 1, 4.5);

        System.out.println("이름 : " + p.getName());
        System.out.println("이름 : " + p.getPhone() );


        // System.out.println("학번 : " + p.hakbun);  사용불가 사용할려면 
        // Student s = (Student)p;  이렇게 해야지 Person 외의 변수도 사용가능 / 형변환 안하면 오류남.
        p.show(); // student에 있는 show가 실행됨
        System.out.println();
        p = new Teacher("장길산", "010-7897-5412", "123456" ,"컴정" , 1000);
        p.show();

    }
}