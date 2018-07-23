class J19P_Q2 {
    static int min3(int a, int b, int c){
        int min = a;
        if(b<min) min = b;
        if(c<min) min = c;
 

        return min;
    }
    public static void main(String[] args){
        System.out.print(min3(10,50,600));
    }
}
