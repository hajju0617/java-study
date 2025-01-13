package com.java.fm.ch12;

import java.util.ArrayList;

class Fruit677 implements Eatable {
    public String toString() {return "Fruit!!";}
}
class Apple677 extends Fruit677 { public String toString() {return "Apple";}}
class Grape677 extends Fruit677 { public String toString() {return "Grape";}}
class Toy677 { public String toString() {return "Toy";}}
interface Eatable {}

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit677> fruitBox = new FruitBox<>();
        FruitBox<Apple677> appleBox = new FruitBox<Apple677>();
        FruitBox<Grape677> grapeBox = new FruitBox<Grape677>();
//    FruitBox<Grape677> grapeBox2 = new FruitBox<Apple677>();      // 에러.
//    FruitBox<Toy677> toyBox = new FruitBox<Toy677>();             // 에러.
        fruitBox.add(new Fruit677());
        fruitBox.add(new Apple677());
        fruitBox.add(new Grape677());
        appleBox.add(new Apple677());
//        appleBox.add(new Grape677());                             // 에러 (Grape는 Apple의 자손이 아님.)
        grapeBox.add(new Grape677());

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("grapeBox = " + grapeBox);
    }
}
class FruitBox<T extends Fruit677 & Eatable> extends Box677<T> {}
class Box677<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    int size() {
        return list.size();
    }
    public String toString() {
        return list.toString();
    }
}
