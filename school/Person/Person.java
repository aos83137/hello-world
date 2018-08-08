package haksa;
public class Person{ //클래스는 public 과 default 뿐이다.
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
        System.out.println("이름 : " + name);
        System.out.println("폰 : " + phone);
    }
}