package haksa;

public class Student extends Person{
    public String hakbun;
    public int grade;
    public double score;

    public Student(){

    }
    public Student(String name,String phone,String hakbun, int grade, double score)
    {
        super(name, phone);
        this.hakbun = hakbun;
        this.grade = grade;
        this.score = score;
    }
    @Override  
    public void show(){
        super.show();
        System.out.println("hakbun : " + hakbun);
        System.out.println("grade : " + grade);
        System.out.println("score : " + score);
    }
}
