class Ex3{
    public static void main(String[] args){
        int[] arr = new int[] {3,2,1,6,5,4};

        printArr(arr);  //�迭�� ��� ��Ҹ�  ���
        sortArr(arr);   //�迭�� ����
        printArr(arr);  //������ ����� ���
        System.out.println("sum =" + sumArr(arr));  //�迭�� ������ ���
    }

    static void printArr(int[] a){
        for(int i : a){
            System.out.print(i);
        }
        System.out.println();
    }

    static void sortArr(int[] a){
        int index,i,j;

        for(i=0;i<a.length-1;i++){
            index =i;
            for(j=i+1;j<a.length;j++){
                if(a[index]>a[j]){
                    index = j;
                }
            }
            int tmp = a[i]; a[i] = a[index]; a[index] = tmp;
        }
    }

    static int sumArr(int[] a){
        int sum=0;
        for(int i : a)
            sum += i;
        return sum;
    }
}