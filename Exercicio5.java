/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicio;

import java.awt.BorderLayout;
import java.util.Scanner;
/**
 *
 * @author joao
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    int cont1_100 = 0;
    int cont101_200 = 0;
    int contMaior200 = 0;
    
    for (int i=1; i <=20; i++){
        System.out.println("Digite o "+i+ "º numero: ");
        int numero = scanner.nextInt();
        
        if (numero >= 0 && numero <= 100){
            cont1_100++;
        }else if(numero >=101 && numero <= 200){
            cont101_200++;
        } else if (numero > 200){
            contMaior200++;
        }
    }
        
        System.out.println("Quantidade entre 0 e 100: "+cont1_100);
        System.out.println("Quantidade entre 101 e 200: "+cont101_200);
        System.out.println("Quantidade maior que 200: "+contMaior200);
    }
}
