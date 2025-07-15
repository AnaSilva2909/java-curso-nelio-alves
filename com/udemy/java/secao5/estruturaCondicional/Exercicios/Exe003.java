package com.udemy.java.estruturaCondicional.Exercicios;

import java.util.Scanner;

public class Exe003 {
    public static void main(String[] args) {
    /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
    "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são 
    múltiplos entre si. Atenção: os números devem poder ser digitados em ordem 
    crescente ou decrescente. */

    Scanner scan = new Scanner(System.in);
    
    int A, B, resultado;

        System.out.println("Digite valor de A: ");
        A = scan.nextInt();

        System.out.println("Digite valor de B: ");
        B = scan.nextInt(); 

        if (A < B) {
          if (  B % A == 0 ) {
            System.out.println("Sao Multiplos");
           }else{
            System.out.println("Nao Multiplos");
           }
 
        }else{
            if (  A % B == 0 ) {
                System.out.println("Sao Multiplos");
               }else{
                System.out.println("Nao Multiplos");
               }
        }


       



       
            
        

        
    














        
    }


    
    
}
