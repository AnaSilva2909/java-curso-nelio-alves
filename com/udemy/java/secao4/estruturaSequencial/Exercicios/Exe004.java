package com.udemy.java.estruturaSequencial.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe004 {
    public static void main(String[] args) {
        /* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
        o valor que recebe por hora e calcula o salário desse funcionário. 
        A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite número do funcionário: ");
        int numFuncionario =  scan.nextInt();

        System.out.println("Digite número de horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();

        System.out.println("Digite o valor que recebe por hora trabalhada: ");
        double valorHoraTrabalhada = scan.nextDouble();

        double valorSalario = horasTrabalhadas * valorHoraTrabalhada;

        System.out.println("NUMBER = " + numFuncionario);
        Locale.setDefault(Locale.US);
        System.out.printf("SALARY = U$ %.2f", valorSalario);


    }
    
}
