class J61P_Q3{
    static int sumOf(int[] a){
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println("�迭 arr�� ��� ����� �հ� : " + sumOf(arr));
    }
}