import java.util.*;

class person{  //변수 함수 두가지만 와야한다
    private String name;    //맴버변수 //private 때문에 p.name쓰면 오류나
    private int age;                //그래서 getName이란 함수를 만들어서 호출한다
    private String phone;  
    private boolean sei;
    //초기화시 문자열은 null, boolean false, int 0
    person(){}
    person(String name, int age, String phone, boolean sei){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.sei = sei;
    }
    person(String name, String phone){
        this(name,20,phone,true);
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
    String getPhone(){
        return phone;
    }
    boolean getSei(){
        return sei;
    }

    int setAge(int age){
        return this.age = age;
    }

    boolean setSei(boolean sei){
        return this.sei = sei;
    }
}

class classTest2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        person p = new person("홍길동","010-1234-5678");
        System.out.print("나이 : ");
        p.setAge(scan.nextInt());

        System.out.print("성별 입력: ");
        String a = scan.nextLine();
        if(a == "남자") p.setSei(true);
        else p.setSei(false);
        
        System.out.println("이름:" + p.getName());  
        System.out.println("나이:" + p.getAge());
        System.out.println("폰:" + p.getPhone());
        System.out.println("성:" + ((p.getSei() == true)? "남자": "여자" ));
    }
}


