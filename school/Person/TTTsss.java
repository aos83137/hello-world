import haksa.Person;
import haksa.Student;
import haksa.Teacher;

class TTTsss{
    public static void main(String[] args){
        Person p;
        p = new Student("�̼���", "010-1234-5678","1235", 1, 4.5);

        System.out.println("�̸� : " + p.getName());
        System.out.println("�̸� : " + p.getPhone() );


        // System.out.println("�й� : " + p.hakbun);  ���Ұ� ����ҷ��� 
        // Student s = (Student)p;  �̷��� �ؾ��� Person ���� ������ ��밡�� / ����ȯ ���ϸ� ������.
        p.show(); // student�� �ִ� show�� �����
        System.out.println();
        p = new Teacher("����", "010-7897-5412", "123456" ,"����" , 1000);
        p.show();

    }
}