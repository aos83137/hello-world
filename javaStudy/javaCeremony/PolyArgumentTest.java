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
        super(100);  //Tv의 가격을 100만으로 한다.
    }
    public String toString(){return "Tv";}

}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){return "Computer";}
}

class Buyer{            //고객
    int money = 1000;   //소지금
    int bonusPoint = 0; //보너스점수

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다.");
            return;  
        }
        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;
        System.out.println(p.toString() + "을/를 구입하셨습니다.");
    }
}
class PolyArgumentTest{
    public static void main(String[] args){
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점 입니다.");
    }
}