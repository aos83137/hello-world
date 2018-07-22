class Q2{
    static void swap(int a[], int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
        System.out.printf("%na[%d]과 a[%d]를 교환합니다.%n", idx1, idx2);
    }
    static void putArr(int[] a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
    public static void main(String[] args){
        int[] arr = new int[] {5,10,73,2,-5,42};

        for(int i=0;i<arr.length/2;i++){ // 역순 정렬 시 실행횟수는 길이/2
            putArr(arr);
            swap(arr,i,arr.length-1-i);
        }
        System.out.println();
        putArr(arr);
        System.out.print("역순 정렬을 마쳤습니다.");
        
    }
}