class Q2{
    static void swap(int a[], int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
        System.out.printf("%na[%d]�� a[%d]�� ��ȯ�մϴ�.%n", idx1, idx2);
    }
    static void putArr(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args){
        int[] arr = new int[] {5,10,73,2,-5,42};

        for(int i=0;i<arr.length/2;i++){ // ���� ���� �� ����Ƚ���� ����/2
            putArr(arr);
            swap(arr,i,arr.length-1-i);
        }
        System.out.println();
        putArr(arr);
        System.out.print("���� ������ ���ƽ��ϴ�.");
        
    }
}