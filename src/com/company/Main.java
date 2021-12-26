package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a,b,c;
        float u,Alan = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("a kenarının değerini giriniz: ");
        a = input.nextFloat();
        System.out.print("b kenarının değerini giriniz: ");
        b = input.nextFloat();
        System.out.print("hipotenüsün değerini giriniz: ");
        c = input.nextFloat();

        u = (a+b+c)/2;
        System.out.println(u);
        Alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Alan= " + Alan);
    }
}
