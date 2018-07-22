class J19P_Q1 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        if(d>max) max = d;

        return max;
    }
    public static void main(String[] args){
        System.out.print(max4(10,50,600,100));
    }
}
