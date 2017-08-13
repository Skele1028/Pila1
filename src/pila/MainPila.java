package pila;

import Data.Valor;
import Modelo.Pila;
import Modelo.OperacionesPila;

/**
 *
 * @author Daniela.diaz_bej
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Pila <Valor> pilaOriginal = new Pila(); 
      //Apilar
      pilaOriginal.apilar(new Valor ("D"));
      pilaOriginal.apilar(new Valor ("A"));
      pilaOriginal.apilar(new Valor ("N"));
      pilaOriginal.apilar(new Valor ("I"));
      
      
                
     System.out.println("" + pilaOriginal.toString());


     //Sistem.out.print ( "" + Pila.);
      //crear interfaz donde me muestre la adicion y la sustraccion de elementos
      //que tenga opcion de duplicar e invertir
      
    }
    
}
