package com.udemy.java.estruturaCondicional.Exercicios;

import java.util.Scanner;

public class Exe004 {
    public static void main(String[] args) {
    /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
     sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração
     mínima de 1 hora e máxima de 24 horas. */   

     Scanner  scan = new Scanner(System.in);
     int hrInicial, hrFinal, totalHrs;

     System.out.println("Digite a hora inicial: ");
     hrInicial = scan.nextInt();
     
     System.out.println("Digite a hora final: ");
     hrFinal = scan.nextInt();
         if (hrInicial < hrFinal) {
            totalHrs = hrFinal - hrInicial;
         }else{
             totalHrs = 24 - (hrInicial - hrFinal) ;
         }

    
     if (totalHrs < 1 || totalHrs > 24) {
        System.out.println("Duração mínima de 1 hora e máxima de 24 horas!");
        
     }

     System.out.println("O JOGO DUROU " + totalHrs + " HORA(S)");




    }
    
}
