import java.util.*;

class Person{  //변수 함수 두가지만 와야한다
    private String name;    //맴버변수 //private 때문에 p.name쓰면 오류나
    private int age;                //그래서 getName이란 함수를 만들어서 호출한다
    private String phone;  
    private boolean sei;
    //초기화시 문자열은 null, boolean false, int 0
    Person(){}
    Person(String name, int age, String phone, boolean sei){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.sei = sei;
    }
    Person(String name, String phone){
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

    void setAge(int age){
        this.age = age;
    }

    void setSei(boolean sei){
        this.sei = sei;
    }
}

class classTest2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Person p = new Person("홍길동","010-1234-5678");
        System.out.print("나이 : ");
        p.setAge(scan.nextInt());      // 입력하면 일단 버퍼에 저장되고 변수에 저장된다??????????????
                                        // 24엔터키 하면 버퍼에는 24엔터키가 들어감
        System.out.print("성별 입력: "); // nextInt에 정수만 가져가고 엔터키가 버퍼에 남아있다
        scan.nextLine(); //버퍼를 비웠다  //그래서 다음 nextLine에서 엔터키가 입력되서 바로 넘어감
        if( scan.nextLine().charAt(0) == '남' ) p.setSei(true);
        else p.setSei(false);
        
        System.out.println("이름:" + p.getName());  
        System.out.println("나이:" + p.getAge());
        System.out.println("폰:" + p.getPhone());
        System.out.println("성:" + ((p.getSei() == true)? "남자": "여자" ));
    }
}



// nextLine();  buffer남아있는것도 다가져온다    - 한 줄 단위로 입력받기 때문에 개행문자도 한 줄로 인식합니다.
// next(); buffer 초기화 하고 가져오는 것 같다?  - 개행문자, 버퍼에서 공백 이전까지만 가져오고 남은 것들은 버퍼에 있다
