package com.udemy.java.estruturaCondicional.Exercicios;

import java.util.Scanner;

public class Exe001 {
    public static void main(String[] args) {
    /*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número: ");
     int num = scan.nextInt();

     if (num < 0) {

        System.out.println("NEGATIVO");        
     }else{
        System.out.println("NAO NEGATIVO");
     }
    }
    
    
}
