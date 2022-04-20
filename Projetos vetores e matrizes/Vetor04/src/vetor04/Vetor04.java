/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Dumbledore
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3,7,6,1,9,4,2};
        Arrays.sort(vet);//usado para ordenar as variaveis do vetor.
        for (int v: vet){//for it, percorre o vetor de maneira simplificada.
            System.out.print(v + " ");// exibi o for it atenção para a sua formatação.
        }
        int p = Arrays.binarySearch(vet, 7);//busca binaria, funciona melhor com as variaveis do vetor ordenadas.
        System.out.println("Encontrei o valor  na posição " + p);
    }
    
}
