package com.udemy.java.estruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe002 {
    public static void main(String[] args) {
    /*Faça um programa para ler o valor do raio de um círculo,
     e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. */

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor do raio do Circulo: ");
    double valorRaioCirculo = scan.nextDouble();

    double area = Math.PI * Math.pow(valorRaioCirculo, 2);

    Locale.setDefault(Locale.US);
    System.out.printf("A = %.4f", area);
    }
    
}
