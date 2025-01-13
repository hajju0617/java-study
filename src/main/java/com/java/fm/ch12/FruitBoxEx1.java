package com.java.fm.ch12;

import java.util.ArrayList;

class Fruit675 { public String toString() {return "Fruit!!";}}
class Apple675 extends Fruit675 { public String toString() {return "Apple";}}
class Grape675 extends Fruit675 { public String toString() {return "Grape";}}
class Toy675 { public String toString() {return "Toy";}}
public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box675<Fruit675> fruitBox675 = new Box675<Fruit675>();
        Box675<Apple675> appleBox675 = new Box675<Apple675>();
        Box675<Toy675> toyBox675 = new Box675<Toy675>();
//        Box<Grape675> grapeBox = new Box<Apple675>();         // 타입 불일치 (에러)

        fruitBox675.add(new Fruit675());
        fruitBox675.add(new Apple675());           // 다형성으로 인해 가능함.

        appleBox675.add(new Apple675());
//        appleBox.add(new Toy675());           // 타입 불일치 (에러)

        toyBox675.add(new Toy675());
//        toyBox.add(new Apple675());           // 타입 불일치 (에러)

        System.out.println(fruitBox675);
        System.out.println(appleBox675);
        System.out.println(toyBox675);
        print(fruitBox675);
    }

    public static void print(Box675<Fruit675> box675) {
        System.out.println(box675);
    }
}

class Box675<T> {
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
