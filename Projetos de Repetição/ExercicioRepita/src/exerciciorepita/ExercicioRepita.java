/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Dumbledore
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int impar = 0, par = 0, acima = 0;
        int media = 0;
        int total = 0;
        int n, s = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html> Informe um número: <br><em>(Valor 0 Interrompe)</em></html> "));
            if(n>100){
                acima++;
            }
        
            if(n%2 == 0){
                par++;
            }else{
                impar++;
            }
            total++;
            s += n;
            media = s/2;
          
       
            }while(n != 0);
        JOptionPane.showMessageDialog(null,"<html> Resultado final <hr>" +
                "<br>Somatório vale: " + s +"<br>Total de Pares "+ par + 
                "<br>Total de Impares: "+ impar +
                "<br>Total de valores: "+ total +
                "<br>Média dos valores: " + media + 
                "<br>Acima de 100: " + acima + "<html>");
                      
         
    }
}

