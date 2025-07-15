package com.udemy.java.estruturaRepetitiva.Exercicios.exercicios_while;

import java.util.Scanner;

public class Exe001 {
    public static void main(String[] args) {
    /*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
     Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
     Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
     e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

     Scanner scan = new Scanner(System.in);

     int senhaCorreta = 2022;

     System.out.println("Digite a senha: ");
     int senha = scan.nextInt();

     while (senha != senhaCorreta) {
        System.out.println("Senha Invalida");
        System.out.println("Digite novamente: ");
        senha = scan.nextInt();
        
     }
     System.out.println("Acesso Permitido");



    }
    
}
