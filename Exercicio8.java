/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicio;

/**
 *
 * @author joao
 */
import java.util.Scanner;
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;

        while (true) {
            
        System.out.println ("Digite um numero! ");
        int numero = scanner.nextInt();
        
        if (numero >=0 && numero <=25){
        intervalo1++;
            }
        if (numero >=26 && numero <=50){
        intervalo2++;
            }
        if (numero >=51 && numero <=75){
        intervalo3++;
            }
        if (numero >=76 && numero <=100){
        intervalo4++;
            }

        else if (numero <0) {
        System.out.println ("Programa encerrado! ");
        break;
            }
    }   
        System.out.println ("A quantidade de numeros entre 0 a 25 é de: "+intervalo1);
        System.out.println ("A quantidade de numeros entre 26 a 50 é de: "+intervalo2);
        System.out.println ("A quantidade de numeros entre 51 a 75 é de: "+intervalo3);
        System.out.println ("A quantidade de numeros entre 76 a 100 é de: "+intervalo4);
    }
}
