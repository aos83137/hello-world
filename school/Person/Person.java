package haksa;
public class Person{ //Ŭ������ public �� default ���̴�.
    protected String name;
    protected String phone;

    public Person(){
    }
    
    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }

    public void show(){
        System.out.println("-------------------");
        System.out.println("�̸� : " + name);
        System.out.println("�� : " + phone);
    }
}