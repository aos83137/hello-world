package com;

class BindingTest3{
    public static void main(String[] args){
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);  //100이 출력
        p.method(); //200,100,200
        System.out.println();
        System.out.println("c.x = " + c.x);  //200이 출력
        c.method(); //200,100,200
    }
}

class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int x = 200;

    void method(){
        System.out.println("x=" + x );  
        System.out.println("super=" +super.x);  
        System.out.println("this="+this.x); 
    }
}