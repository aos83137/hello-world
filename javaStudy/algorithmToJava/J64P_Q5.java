class J64P_Q5{
    static void rcopy(int[] a, int[] b){
        for(int i=0;i<a.length;i++){
            a[i] = b[a.length-1-i];
        }
    } // �������� �����ϴ� �޼���

    static void putArr(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    } //�迭 ��� �޼���

    public static void main(String[] args){
        int[] a = new int[5];
        int[] b= {1,2,3,4,5};
        
        rcopy(a,b);
        putArr(a);
    }
}