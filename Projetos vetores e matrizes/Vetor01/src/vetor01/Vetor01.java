/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author Dumbledore
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[]= {3,2,8,7,5,4}; //forma simples de atribuição de vetores.
        
        for(int i = 0; i<n.length; i++  ){// é um atributo do objeto vetor, ele refere-se ao tamanho do vetor.
            System.out.println("Na posição " + i +" temos o valor: " + n[i]);
            
        }
    }
    
}
