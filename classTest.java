class Score{
    int kor, eng, mat;  // 맴버변수, 속성
    double avg;
    Score(int a, int b, int c){  
        this.kor = a; //this.을 사용해서 맴버변수 인것을 표시한다. 해도 되고 안해도 되고
        eng = b;
        mat = c;
    }

    Score(){ // 매개 변수가 없는 생성자 작성 같은 이름 : Overloading

    }

    double average(){
        double a = (kor + eng + mat)/3.0;
        return a;
    }
    // static int fun (){} 이런건 함수 메서드
    //메소드 생성자가 없으면 이걸 컴파일러가 자동으로 만들어줌     
    //생성자는 return값이 없다
}

class classTest{
    public static void main(String[] args){
        Score[] sc = new Score[2]; 

        sc[0] = new Score();  // 클래스 생성 -> 객체(인스턴스)
        sc[1] = new Score(90,88,100);
        
        sc[0].kor = 95; 
        sc[0].eng = 70;
        sc[0].mat = 80;

        System.out.println(sc[0].average());

                
        // sc[1].kor = 90; 
        // sc[1].eng = 85;
        // sc[1].mat = 100;

        System.out.println(sc[1].average());
    }
}