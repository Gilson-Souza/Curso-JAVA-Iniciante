/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorial03;

/**
 *
 * @author Dumbledore
 */
public class Fatorial03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    int fatorial = 1;

    for(int n = 1; n <= 10; n ++){

      fatorial = n;

      for(int fat = (n - 1); fat >= 1; fat --){

        if(fat == 0){

          fat = 1;

        }

        fatorial = fatorial * fat;
      }

      System.out.println("Fatorial do número (" + n + ") é igual a " + fatorial);
  

        }
    
    }
}