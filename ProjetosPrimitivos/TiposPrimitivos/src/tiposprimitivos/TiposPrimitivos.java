/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Dumbledore
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o Nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.printf("Digite a Nota do Aluno: ");
        float nota = teclado.nextFloat();
        System.out.println("A nota é " +nota);
        System.out.printf("A nota de %s é %.2f\n",nome, nota);
        System.out.format("A nota de %s é %.2f\n",nome, nota);
        
    }
    
}
