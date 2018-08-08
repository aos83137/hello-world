package com;

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
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

class Buyer{            //����
    int money = 1000;   //������
    int bonusPoint = 0; //���ʽ�����

    void buy(Product p){
        if(money < p.price){
            System.out.println("�ܾ��� �����մϴ�.");
            return;  
        }
        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;
        System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�.");
    }
}
class PolyArgumentTest{
    public static void main(String[] args){
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�.");
        System.out.println("���� ���ʽ������� " + b.bonusPoint + "�� �Դϴ�.");
    }
}