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

        System.out.println("배열 arr의 모든 요소의 합계 : " + sumOf(arr));
    }
}