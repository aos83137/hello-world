import haksa.Person;
import haksa.Student;
import haksa.Teacher;

class TTTsss2{

    public static void print(Person p){
        if(p instanceof Student){                               //p ���� Student���� Ȯ��
            System.out.println("�л��Դϴ�.");
            System.out.println("-------------------");
            System.out.println("�̸� : " + p.getName());
            System.out.println("�� : " + p.getPhone());

            Student s = (Student)p;
            System.out.println("sabun : " + s.hakbun);
            System.out.println("depart : " + s.grade);
            System.out.println("salary : " + s.score);
        }else if(p instanceof Teacher){
            System.out.println("�����Դϴ�.");
            System.out.println("-------------------");
            System.out.println("�̸� : " + p.getName());
            System.out.println("�� : " + p.getPhone());

            Teacher t = (Teacher)p;
            System.out.println("sabun : " + t.getSabun());
            System.out.println("depart : " + t.getDepart());
            System.out.println("salary : " + t.getSalary());
        }

    }

    public static void main(String[] args){
        Person p = new Student("�̼���", "010-1234-5678","1235", 1, 4.5);  

        print(p);

        p = new Teacher("����", "010-7897-5412", "123456" ,"����" , 1000);

        print(p);

    }
}