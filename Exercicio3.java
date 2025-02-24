/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicio;
import java.util.Scanner;

/**
 *
 * @author joao
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        int somaDiv = 0;
        
        for (int i = 1; i < numero; i++ ){
    if (numero % i == 0) {  // Verifica se 'i' é divisor de 'numero';  
            }
        }

        if (somaDiv == numero) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        scanner.close();
    }
    
}
