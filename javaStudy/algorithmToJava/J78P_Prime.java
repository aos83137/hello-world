class J78P_Prime{
    public static void main(String[] args){
        int count =0; //곱셈과 나눗셈의 횟수
        int ptr = 0; //찾은 소수의 개수
        int[] prime = new int[500]; //소수를 저장하는 배열

        prime[ptr++] = 2;  //prime[0] 에 소수 2를 저장
        prime[ptr++] = 3; //prime[1] 에 소수 3을 저장 ptr은 2

        for(int n=5;n<=1000;n+=2){  //짝수는 2로 다 나눠지므로 5부터 홀수만 선택
            boolean flag=true;
            for(int i=1;prime[i]*prime[i]<=n;i++){
                count+=2;
                if(n%prime[i] == 0){
                    flag = false; //나눠지니깐 소수가 아니다
                    break;
                }
            }//끝까지 안나눠지면 flag == true 소수이다
            if(flag){
                prime[ptr++] = n; //찾은 소수를 prime[]에 저장  , ptr은 찾은 소수 갯수
                count++; 
            }
        }

        for(int i=0;i<ptr;i++)
            System.out.println(prime[i]);

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + count);
    }
}