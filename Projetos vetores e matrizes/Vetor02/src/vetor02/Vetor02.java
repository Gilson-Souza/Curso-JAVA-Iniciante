/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author Dumbledore
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ano[] = {2022, 2023, 2024, 2025};
        String mes[]={"jan","fev","mar","abr","mai","jun","jul"
                ,"ago","set","out","nov","dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int i = 0; i < ano.length; i++){
                System.out.println("Proximo ano é: " + ano[i]);
                if(ano[i] == 3){
                tot[1] = 29;
                }
                for(int j = 0;j <tot.length; j++ ){
                System.out.println("O ano é "+ ano[i]+" O mês de " + mes[j] + " tem " + tot[j] + 
                " dias ao todo");
            } 
        }               
    }   
    
}
    

