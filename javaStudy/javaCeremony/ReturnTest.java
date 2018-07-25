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
    }  // ������ ������ ����ϸ� �޼��� �ϳ��� �������� ��ȯ���� ��� ���� ȿ���� ���� �� �ִ�.
}