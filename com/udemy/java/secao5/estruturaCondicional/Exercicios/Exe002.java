package com.udemy.java.estruturaCondicional.Exercicios;

import java.util.Scanner;

public class Exe002 {
    public static void main(String[] args) {
    /*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num = scan.nextInt();

    if (num % 2 == 0) {
        System.out.println("PAR");
        
    }else{
        System.out.println("IMPAR");
    }
    
    }
    
}
