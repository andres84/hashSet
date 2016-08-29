package hashset;

import java.util.HashSet;
import java.util.Set;

public class hashset {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        
        la interface Set va a permitir agregar elementos a una lista con orden impredesible
        y que los elementos no puedan ser repetidos
        
        */
        Set<String> lista = new HashSet();
        
        lista.add("a");
        lista.add("e");
        lista.add("e");
        lista.add("i");
        
        for(String dato : lista){
            
            System.out.println(dato);
            
        }
        
    }
    
}
