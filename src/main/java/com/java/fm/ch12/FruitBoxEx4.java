package com.java.fm.ch12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit681 {
    String name;
    int weight;
    public Fruit681(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name + "(" + weight + ")";
    }
}

class Apple681 extends Fruit681 {
    public Apple681(String name, int weight) {
        super(name, weight);
    }
}
class Grape681 extends Fruit681 {
    public Grape681(String name, int weight) {
        super(name, weight);
    }
}
class AppleComp implements Comparator<Apple681> {
    @Override
    public int compare(Apple681 t1, Apple681 t2) {
        return t2.weight - t1.weight;
    }
}
class GrapeComp implements Comparator<Grape681> {
    @Override
    public int compare(Grape681 t1, Grape681 t2) {
        return t2.weight - t1.weight;
    }
}
class FruitComp implements Comparator<Fruit681> {
    @Override
    public int compare(Fruit681 t1, Fruit681 t2) {
        return t1.weight - t2.weight;
    }
}
public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox681<Apple681> appleBox = new FruitBox681<Apple681>();
        FruitBox681<Grape681> grapeBox = new FruitBox681<Grape681>();

        appleBox.add(new Apple681("GreenApple", 100));
        appleBox.add(new Apple681("GreenApple", 300));
        appleBox.add(new Apple681("GreenApple", 500));

        grapeBox.add(new Grape681("GreenGrape", 200));
        grapeBox.add(new Grape681("GreenGrape", 300));
        grapeBox.add(new Grape681("GreenGrape", 400));

        /*
            public static <T> void sort(List<T> list, Comparator<? super T> c) {
               list.sort(c);
            }
        */
        Collections.sort(appleBox.getList(), new AppleComp());
        Collections.sort(grapeBox.getList(), new GrapeComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println("----------");
        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());
        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
class FruitBox681<T extends Fruit681> extends Box681<T> {}

class Box681<T> {
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
