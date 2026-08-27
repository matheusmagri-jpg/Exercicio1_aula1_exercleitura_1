/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1_aula1_exercleitura;

import java.util.Scanner;
import java.util.Scanner; // Lê dados do teclado/arquivo (entrada do usuário)
//import java.util.ArrayList; // Lista dinâmica que cresce automaticamente
//import java.util.HashMap; // Mapa chave→valor, acesso rápido por chave
//import java.util.Map; // Interface base para mapas como HashMap e TreeMap
//import java.util.Date; // Representa uma data e hora específicas
//import java.text.SimpleDateFormat; // Formata e analisa datas no formato desejado
//import java.util.Random; // Gera números pseudoaleatórios
//import java.util.Arrays; // Utilitários para trabalhar com arrays (ordenar, buscar, comparar)
//import java.util.Collections; // Operações prontas para coleções (ordenar, embaralhar, máximo/mínimo)
//import java.math.BigDecimal; // Números decimais com precisão exata (evita erros de ponto flutuante)
//import java.io.IOException; // Exceção para erros de entrada e saída (leitura/escrita de arquivos)

/**
 *
 * @author matheus
 */
public class Exercicio1_aula1_exercleitura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

        System.out.print("Digite a nota do primeiro Bimestre: ");
        int x = in.nextInt();
        System.out.println();
        System.out.print("Digite a nota  do segundo Bimestre: ");
        int y = in.nextInt();
        System.out.println();
        int media = (2 * x + 3 * y) / 2; 
        System.out.println("A media e: " + media);

    }
    
}
