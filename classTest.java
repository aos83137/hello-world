class Score{
    int kor, eng, mat;  // �ɹ�����, �Ӽ�
    double avg;
    Score(int a, int b, int c){  
        this.kor = a; //this.�� ����ؼ� �ɹ����� �ΰ��� ǥ���Ѵ�. �ص� �ǰ� ���ص� �ǰ�
        eng = b;
        mat = c;
    }

    Score(){ // �Ű� ������ ���� ������ �ۼ� ���� �̸� : Overloading

    }

    double average(){
        double a = (kor + eng + mat)/3.0;
        return a;
    }
    // static int fun (){} �̷��� �Լ� �޼���
    //�޼ҵ� �����ڰ� ������ �̰� �����Ϸ��� �ڵ����� �������     
    //�����ڴ� return���� ����
}

class classTest{
    public static void main(String[] args){
        Score[] sc = new Score[2]; 

        sc[0] = new Score();  // Ŭ���� ���� -> ��ü(�ν��Ͻ�)
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