import haksa.Person;
import haksa.Student;
import haksa.Teacher;

class TTTsss2{

    public static void print(Person p){
        if(p instanceof Student){                               //p ���� Student���� Ȯ��
            System.out.println("�л��Դϴ�.");
        }else if(p instanceof Teacher){
            System.out.println("�����Դϴ�.");
        }

    }

    public static void main(String[] args){
        Person p = new Student("�̼���", "010-1234-5678","1235", 1, 4.5);  

        print(p);

        p = new Teacher("����", "010-7897-5412", "123456" ,"����" , 1000);

        print(p);

    }
}