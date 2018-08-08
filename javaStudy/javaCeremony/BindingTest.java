package com;

//�ɹ������� ���� Ŭ������ �ڼ� Ŭ������ �ߺ����� ���ǵ� ���
//����Ÿ���� ���������� ���� ����Ŭ������ �ɹ������� ���
//�ڼ�Ÿ���� ���������� ���� ����Ŭ������ �ɹ������� ���

class BindingTest{
    public static void main(String[] args){
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);  //100�� ���
        p.method();

        System.out.println("c.x = " + c.x);  //200�� ���
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