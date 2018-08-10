package com;

class InnerEx1{
    static int te = 3000;
    class InstanceInner{    //인스턴스 클래스
        int iv = 100;
        //static int cv = 100;  static 변수 사용불가
        final static int CONST = 100;  
    }

    static class StaticInner{ //스태틱 클래스
        int iv = 200;
        static int cv = 200;  //static 클래스만 static 맴버를 정의할 수 있다.
    }
    void myMethod(){
        class Localinner{
            int iv = 300;   
            //static int cd = 300;                //에러 static 변수를 선언할 수 없다.
            final static int CONST = 300;;      //final static은 상수이므로 허용.
        }
    }
    public static void main(String[] args){
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        System.out.println(te);
    }
}

