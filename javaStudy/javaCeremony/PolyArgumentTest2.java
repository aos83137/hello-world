package com;

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product(){}
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
    Product[] item = new Product[10];
    int i=0;
    void buy(Product p){
        if(money < p.price){
            System.out.println("�ܾ��� �����մϴ�.");
            return;  
        }
        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;
        item[i++] = p;          //�� ��ǰ�� Product[] item�� �����Ѵ�.
        System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�.");
    }
    void summary(){             //���� ��ǰ�� ���� ������ ����ؼ� �����ش�.
        int sum = 0;            //���� ���� �հ�    
        String itemList ="";    //������ ��ǰ���
        
        //�ݺ��� �̿� �հ� ǰ�� ����
        for(int j=0;j<item.length;j++){
            if(item[j] == null) break;
            sum += item[j].price;
            itemList += item[j].toString() + ", ";
        }
        System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "  +sum +"�����Դϴ�.");
        System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
    }
}


class PolyArgumentTest2{
    public static void main(String[] args){
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());

        System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�.");
        System.out.println("���� ���ʽ������� " + b.bonusPoint + "�� �Դϴ�.");
        b.summary();
    }
}