package com;
import java.util.*;     //vector���

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product(){
        this.price = 0;
        this.bonusPoint = 0;
    }
}

class Tv extends Product{
    Tv(){
        super(100);  //Tv�� ������ 100������ �Ѵ�.
    }
    public String toString(){return "Tv";}

}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){return "Computer";}
}

class Audio extends Product{
    Audio(){
        super(50);
    }
    public String toString(){return "Audio";}
}

class Buyer{            //��
    int money = 1000;   //������
    int bonusPoint = 0; //���ʽ�����
    Vector item = new Vector();

    void buy(Product p){
        if(money < p.price){
            System.out.println("�ܾ��� �����մϴ�.");
            return;  
        }
        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;
        item.add(p);          //�� ��ǰ�� Vector�� �����Ѵ�.
        System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�.");
    }

    void refund(Product p){     //ȯ���Ѵ�.
        if(item.remove(p)) {     //��ǰ�� Vector���� �����Ѵ�.
            money += p.price;
            bonusPoint =+ p.bonusPoint;
            System.out.println(p + "��/�� ��ǰ �ϼ̽��ϴ�.");
        }else{                  //���� ����
            System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
        }
    }

    void summary(){             //���� ��ǰ�� ���� ������ ����ؼ� �����ش�.
        int sum = 0;            //���� ���� �հ�    
        String itemList ="";    //������ ��ǰ���
     
        if(item.isEmpty()){
            System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
            return;
        }

        //�ݺ��� �̿� �հ� ǰ�� ����
        for(int j=0;j<item.size();j++){
            Product p = (Product)item.get(j); //Vector�� j��°�� �ִ� ��ü�� ���´�.
            sum += p.price;
            itemList += (j==0) ? "" + p : ", " + p;
        }
        System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "  +sum +"�����Դϴ�.");
        System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
    }
}


class PolyArgumentTest3{
    public static void main(String[] args){
        Buyer b = new Buyer();
        Tv tv =new Tv();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}