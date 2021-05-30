package com.learn.javacourse;



import java.util.ArrayList;
import java.util.Vector;

public class Main {
private  int size;
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        int vector;
        int n =100;
        Vector<Integer> v = new Vector<Integer>(n);
        
for(int i = 1; i<=100; i++) {
    v.add(i);

    System.out.println(v);

    System.out.println(v.remove(4));
    v.remove();
}

    for(int i = 1; i < v.size(); i++ ) {

        System.out.println(v.get(i));
    }


        System.out.println(v);

    }









        }











