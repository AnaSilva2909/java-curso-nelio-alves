package com.udemy.java.estruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe005 {
    public static void main(String[] args) {
    /*Fazer um programa para ler o código de uma peça 1, o número de peças 1,
     o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
     e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

     Scanner scan = new Scanner (System.in);

     int cod1, numPecas, cod2;
     double valorUni1, valorUni2, valorPg1, valorPg2, valorCompra;

     System.out.println("Digite código da Peça 1: ");
     cod1 = scan.nextInt();
     System.out.println("Digite numeros de peças: ");
     numPecas = scan.nextInt();
     System.out.println("Digite valor Unitário: ");
     valorUni1 = scan.nextDouble();
     valorPg1 = valorUni1 * numPecas;

     System.out.println("Digite código da Peça 2: ");
     cod2 = scan.nextInt();
     System.out.println("Digite numeros de peças: ");
     numPecas = scan.nextInt();
     System.out.println("Digite valor Unitário: ");
     valorUni2 = scan.nextDouble();
     valorPg2 = valorUni2 * numPecas;

     valorCompra = valorPg1 + valorPg2;
     Locale.setDefault(Locale.US);
     System.out.printf("VALOR A PAGAR: R$ %.2f", valorCompra);

     
    }
    
}
