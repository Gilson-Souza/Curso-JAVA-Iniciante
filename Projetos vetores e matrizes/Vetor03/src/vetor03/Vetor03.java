/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor03;

import java.util.Arrays;/* biblioteca de Arrays muito util para organizar
                            vetores entre outras atividades*/

/**
 *
 * @author Dumbledore
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[]= {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);// comando para ordenar as variaveis dentro do vetor.
        for (double valor: v){ // for it usado para percorrer o vetor de maneira mais simplificada.
            System.out.println(valor + " "); // valor é usado para exibir o for it.
        }
    }
    
}
