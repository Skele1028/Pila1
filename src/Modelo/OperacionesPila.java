
package Modelo;

/**
 *
 * @author Daniela.diaz_bej
 */
public class OperacionesPila <T extends Base> {
    
    //Metodo para dplicar la pila
    public static <T extends Base> Pila<T> duplicar (Pila<T> pilaOriginal){
        
        Pila<T> pilaAux = new Pila<>();
        Pila<T> pilaCopia = new Pila<>();
        
        while (!pilaOriginal.estaVacio()){
            pilaAux.apilar(pilaOriginal.desapilar());
        }
        while (!pilaAux.estaVacio()){
            T e = pilaAux.desapilar();
            T c = (T) e.copy();
            pilaOriginal.apilar(e);
            
            pilaCopia.apilar(c);
        }
        return pilaCopia;
    }
    
    
    public static <T extends Base> Pila <T> invertirPila (Pila<T> pilaOriginal){
        
        Pila<T> pilaInvert = new Pila <> ();
        Pila<T> pilaAux = new Pila <> ();
     
    
        while (!pilaOriginal.estaVacio()){
            pilaAux.apilar(pilaOriginal.desapilar());
        }    
        
    return pilaInvert;
    }
}
