package com;

class InnerEx1{
    static int te = 3000;
    class InstanceInner{    //�ν��Ͻ� Ŭ����
        int iv = 100;
        //static int cv = 100;  static ���� ���Ұ�
        final static int CONST = 100;  
    }

    static class StaticInner{ //����ƽ Ŭ����
        int iv = 200;
        static int cv = 200;  //static Ŭ������ static �ɹ��� ������ �� �ִ�.
    }
    void myMethod(){
        class Localinner{
            int iv = 300;   
            //static int cd = 300;                //���� static ������ ������ �� ����.
            final static int CONST = 300;;      //final static�� ����̹Ƿ� ���.
        }
    }
    public static void main(String[] args){
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        System.out.println(te);
    }
}

