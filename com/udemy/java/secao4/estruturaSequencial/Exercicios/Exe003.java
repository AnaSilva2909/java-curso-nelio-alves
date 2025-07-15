package com.udemy.java.estruturaSequencial.Exercicios;

import java.util.Scanner;

public class Exe003 {
    public static void main(String[] args) {
        /*Fazer um programa para ler quatro valores inteiros A, B, C e D.
         A seguir, calcule e mostre a diferença do produto de A e B pelo 
         produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

         Scanner scan = new Scanner(System.in);

         int A, B, C, D, DIFERENCA;

         System.out.println("Digite valor de A: ");
         A = scan.nextInt();

         System.out.println("Digite valor de B: ");
         B = scan.nextInt();
         
         System.out.println("Digite valor de C: ");
         C = scan.nextInt();

         System.out.println("Digite valor de D: ");
         D = scan.nextInt();

         DIFERENCA = ((A * B ) - (C * D));  
         System.out.println(DIFERENCA);
         
        

         
    
    
    
    
    
        }





    
}
