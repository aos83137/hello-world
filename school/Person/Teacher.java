package haksa;

public class Teacher extends Person{
    private String sabun;
    private String depart;
    private int salary;

    Teacher(){

    }
    public Teacher(String name, String phone, String sabun, String depart, int salary){
        super(name, phone);
        this.sabun = sabun;
        this.depart = depart;
        this.salary = salary;
    }

    String getSabun(){
        return sabun;
    }
    void setSabun(String sabun){
        this.sabun = sabun;
    }
    String getDepart(){
        return depart;
    }
    void setDepart(String depart){
        this.depart = depart;
    }
    int getSalary(){
        return salary;
    }
    void setSalary(int salary){
        this.salary = salary;
    }



    @Override
    public void show(){
        super.show();
        System.out.println("sabun : " + getSabun());
        System.out.println("depart : " + getDepart());
        System.out.println("salary : " + getSalary());
    }
}