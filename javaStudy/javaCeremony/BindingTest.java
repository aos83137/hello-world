package com;

//맴버변수가 조상 클래스와 자손 클래스에 중복으로 정의된 경우
//조상타입의 참조변수를 사용시 조상클래스의 맴버변수가 사용
//자선타입의 참조변수를 사용시 조상클래스의 맴버변수가 사용

class BindingTest{
    public static void main(String[] args){
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);  //100이 출력
        p.method();

        System.out.println("c.x = " + c.x);  //200이 출력
        c.method();
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
        System.out.println("Child Method");
    }
}