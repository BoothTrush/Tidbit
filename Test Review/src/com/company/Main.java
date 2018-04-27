package com.company;
import java.util.*;
import java.io.*;
import java.util.Random.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Random rand = new Random();
        int Array1 [] = new int[50];
        for(int i= 0;i<50;i++) {
            Array1[i] = rand.nextInt(50) + 1;
            System.out.println(Array1[i]);
        }
    }
}
