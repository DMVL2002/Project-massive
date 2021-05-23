import java.util.Scanner;
//package com.company;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>((a, b) -> a.getValue().toString().compareTo(b.getValue().toString()));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Randomizer.randomString(myList, n);
        System.out.println(myList);
        System.out.print("Поменять элементы: ");
        int r = in.nextInt();
        int e = in.nextInt();
        myList.swap(r, e);
        System.out.println(myList);
        System.out.println(myList.indexAt(2));
        System.out.print("отсортированный myList: ");
        myList.sort();
        System.out.println(myList);
        MyList <Integer> myList2  = new MyList<>((a, b) -> a.getValue().toString().compareTo(b.getValue().toString()));
        Randomizer.randomInteger(myList2, n);
        System.out.println(myList2);
        System.out.print("Поменять элементы: ");
        r = in.nextInt();
        e = in.nextInt();
        myList2.swap(r, e);
        System.out.println(myList2);
        System.out.print("отсортированный myList: ");
        myList2.sort();
        System.out.println(myList2);
    }
}