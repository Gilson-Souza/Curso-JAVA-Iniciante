/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao;

/**
 *
 * @author Dumbledore
 */
public class TesteFuncao {
    
    static int soma(int a, int b){
        int s = a + b;
       return s;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa ");
        int sm = soma(5, 2);
        System.out.println("A soma vale " + sm);
        
    }
    
}
