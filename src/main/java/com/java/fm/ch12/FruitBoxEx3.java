package com.java.fm.ch12;

import java.util.ArrayList;

class Fruit680 { public String toString() { return "Fruit";}}
class Apple680 extends Fruit680 { public String toString() {return "Apple";}}
class Grape680 extends Fruit680 { public String toString() {return "Grape";}}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }
    public String toString() { return name;		 }
}

class Juicer {
    static Juice makeJuice(FruitBox680<? extends Object> box) {
        String tmp = "";

        for (Fruit680 f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox680<Fruit680> fruitBox = new FruitBox680<Fruit680>();
        FruitBox680<Apple680> appleBox = new FruitBox680<Apple680>();

        fruitBox.add(new Apple680());
        fruitBox.add(new Grape680());
        appleBox.add(new Apple680());
        appleBox.add(new Apple680());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

class FruitBox680<T extends Fruit680> extends Box680<T> {}

class Box680<T> {
    //class FruitBox680<T extends Fruit680> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    ArrayList<T> getList() {
        return list;
    }
    int size() {
        return list.size();
    }
    public String toString() {
        return list.toString();
    }
}
