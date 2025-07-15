package com.udemy.java.estruturaRepetitiva.Exercicios.exercicios_for;

import java.util.Scanner;

public class Exe002 {
    public static void main(String[] args) {
    /*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
    mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo,
    e "out" para fora do intervalo).*/

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite número: ");
    int x = scan.nextInt();

    for(int i = 0; i <=x; i++){
        if (i >= 10 & i <= 20) {
            System.out.println(i + " in");
            
        }else{
            System.out.println(i + " out");

        }

    }
    }
    
}
