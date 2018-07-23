class J78P_Prime{
    public static void main(String[] args){
        int count =0; //������ �������� Ƚ��
        int ptr = 0; //ã�� �Ҽ��� ����
        int[] prime = new int[500]; //�Ҽ��� �����ϴ� �迭

        prime[ptr++] = 2;  //prime[0] �� �Ҽ� 2�� ����
        prime[ptr++] = 3; //prime[1] �� �Ҽ� 3�� ���� ptr�� 2

        for(int n=5;n<=1000;n+=2){  //¦���� 2�� �� �������Ƿ� 5���� Ȧ���� ����
            boolean flag=true;
            for(int i=1;prime[i]*prime[i]<=n;i++){
                count+=2;
                if(n%prime[i] == 0){
                    flag = false; //�������ϱ� �Ҽ��� �ƴϴ�
                    break;
                }
            }//������ �ȳ������� flag == true �Ҽ��̴�
            if(flag){
                prime[ptr++] = n; //ã�� �Ҽ��� prime[]�� ����  , ptr�� ã�� �Ҽ� ����
                count++; 
            }
        }

        for(int i=0;i<ptr;i++)
            System.out.println(prime[i]);

        System.out.println("������ �������� ������ Ƚ�� : " + count);
    }
}