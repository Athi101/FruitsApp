package com.example.aathira.luckywatermelon;

public class Fruit {

    String fruitName;
    int fruitId;

    public Fruit(String fruitName , int fruitId){
        this.fruitName = fruitName;
        this.fruitId = fruitId;
    }

    public String getFruitName(){
        return fruitName;

    }

    public int getFruitId(){
        return fruitId;

    }


}
