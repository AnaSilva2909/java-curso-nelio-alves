package com.udemy.java.estruturaCondicional.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe005 {
    public static void main(String[] args) {
    /*Com base na tabela abaixo, escreva um programa que leia o código de um item
     e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.*/

     Scanner scan = new Scanner(System.in);

     int cod, qtd;
     double preco, valorCompra;
     String produto = "";
     preco = 0;

     boolean codExiste = false;

     System.out.println("Digite código do produto: ");
     cod = scan.nextInt();
     System.out.println("Digite quantidade: ");
     qtd = scan.nextInt();

     if (cod == 1) {
        preco = 4.00;
        produto = "Cachorro Quente";
        codExiste = true;
        
        
     }else if (cod == 2) {
        preco = 4.50;
        produto = "X-Salada";
        codExiste = true;
        
     }else if (cod == 3) {
        preco = 5.00;
        produto = "X-Bacon";
        codExiste = true;
        
     }else if (cod == 4) {
        preco = 2.00;
        produto = "Torrada Simples";
        codExiste = true;
        
     }else if (cod == 5) {
        preco = 1.50;
        produto = "Refrigerante";
        codExiste = true;
        
     }else{
        codExiste = false;
        System.out.println("Código inválido!");

        
     }

     if (codExiste == true) {
       valorCompra = preco * qtd;

     Locale.setDefault(Locale.US);
     System.out.println("Produto: " + qtd + "x " +  produto);
     System.out.printf("Total: R$ %.2f",valorCompra); 
     }

     
     
    }
    
}
