package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hola mundo Gustav1");
        System.out.println("Modificacion hecha por Miguel");

        System.out.println("EL resultado de 5+3 es: " + suma(5,3));
        System.out.println("2 y 2 son cuatro, y dos son 6, 2 son 8 y 8 son " + multi(4,4));


    }

    public static int suma(int n1, int n2){
        return n1+n2;
    }

    public static int multi(int n1, int n2){
        return n1*n2;
    }

}
