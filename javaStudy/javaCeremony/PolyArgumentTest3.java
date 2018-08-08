package com;
import java.util.*;     //vector사용

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

class Audio extends Product{
    Audio(){
        super(50);
    }
    public String toString(){return "Audio";}
}

class Buyer{            //고객
    int money = 1000;   //소지금
    int bonusPoint = 0; //보너스점수
    Vector item = new Vector();

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다.");
            return;  
        }
        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;
        item.add(p);          //이 제품을 Vector에 저장한다.
        System.out.println(p.toString() + "을/를 구입하셨습니다.");
    }

    void refund(Product p){     //환불한다.
        if(item.remove(p)) {     //제품을 Vector에서 제거한다.
            money += p.price;
            bonusPoint =+ p.bonusPoint;
            System.out.println(p + "을/를 반품 하셨습니다.");
        }else{                  //제거 실패
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary(){             //구매 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;            //구매 가격 합계    
        String itemList ="";    //구입한 물품목록
     
        if(item.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        //반복문 이용 합계 품목 저장
        for(int j=0;j<item.size();j++){
            Product p = (Product)item.get(j); //Vector의 j번째에 있는 객체를 얻어온다.
            sum += p.price;
            itemList += (j==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 "  +sum +"만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
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