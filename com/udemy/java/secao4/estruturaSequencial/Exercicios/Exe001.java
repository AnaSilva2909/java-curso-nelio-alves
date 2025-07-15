package com.udemy.java.estruturaSequencial.Exercicios;

import java.util.Scanner;

public class Exe001 {
    public static void main(String[] args) {
    /*Faça um programa para ler dois valores inteiros, 
    e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.*/

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite os valores: ");
    int num1, num2, resultado;
    num1 = scan.nextInt();
    num2 = scan.nextInt();

    resultado =  num1 + num2;

    System.out.println("SOMA = " + resultado);


    }
    
}
