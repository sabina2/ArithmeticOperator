package com.Loading;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter our 1st number");
        int a=scanner.nextInt();
        System.out.println("Enter your 2nd number");
        int b=scanner.nextInt();
        int x=a+b;
        int y=a-b;
        int z=a*b;
        int k=a/b;
        int l=a++;
        int m=++a;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

    }
}
