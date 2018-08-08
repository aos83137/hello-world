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
    Product[] item = new Product[10];
    int i=0;
    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다.");
            return;  
        }
        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;
        item[i++] = p;          //이 제품을 Product[] item에 저장한다.
        System.out.println(p.toString() + "을/를 구입하셨습니다.");
    }
    void summary(){             //구매 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;            //구매 가격 합계    
        String itemList ="";    //구입한 물품목록
        
        //반복문 이용 합계 품목 저장
        for(int j=0;j<item.length;j++){
            if(item[j] == null) break;
            sum += item[j].price;
            itemList += item[j].toString() + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 "  +sum +"만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}


class PolyArgumentTest2{
    public static void main(String[] args){
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());

        System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점 입니다.");
        b.summary();
    }
}