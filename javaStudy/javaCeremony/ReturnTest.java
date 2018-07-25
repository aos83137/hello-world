class ReturnTest{
    public static void main(String[] args){
        Test r = new Test();

        int result = r.add(3,5);
        System.out.println(result);

        int[] result2 = new int[3];
        r.add(3,5,result2);
        for(int i : result2)
            System.out.println(i);
    }
}

class Test{
    static int add(int a, int b){
        return a+b;
    }

    public static void add(int a, int b, int[] arr){
        arr[0] = a+b;
        arr[1] = a-b;
        arr[2] = a*b;
    }  // 참조형 변수를 사용하면 메서드 하나로 여러개의 반환값을 얻는 듯한 효과를 받을 수 있다.
}