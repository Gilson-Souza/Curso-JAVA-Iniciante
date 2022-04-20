
package idiomadosistema;

import java.util.Locale;




public class IdiomaDoSistema {

    public static void main(String[] args) {
        System.out.println("O idioma do Sistema é");
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
     
       
    }
   
}
