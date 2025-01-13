package com.java.fm.ch12;

import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv extends Product {}
class Audio extends Product {}
public class GenericsEx {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<Tv> tvList = new ArrayList<>();
        //    ArrayList<Product> productList2 = new ArrayList<Tv>();        // 타입 불일치 (에러)
        List<Tv> tvList2 = new ArrayList<Tv>();                             // 다형성

        productList.add(new Tv());              // public class ArrayList<E>, public boolean add(E e) -> public boolean add(Product e).
        productList.add(new Audio());           // 즉, 다형성으로 인해 가능해짐.

        tvList.add(new Tv());
//        tvList.add(new Audio());              // 타입 불일치 (에러)
        printAll(productList);
//        printAll(tvList);
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }

}
