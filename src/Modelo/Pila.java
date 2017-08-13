/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Data.Persona;
import java.util.LinkedList;

/**
 *
 * @author Daniela.diaz_bej
 */
public class Pila <T extends Base> {
    //tope o nombre de la pila
    private LinkedList <T> pila;
    
    public Pila (){
        //crea la pila
        pila = new LinkedList<>();
    }
    //objeto de la fila
    
    public void apilar(T e){
        pila.addFirst(e);        
    }
    
    public T desapilar (){
     if( !estaVacio()){
     return pila.removeFirst();
     }
     else{
         return null ;
        }
    }
    
    public boolean estaVacio(){
        return pila.isEmpty();
    }
    
    
    @Override
        public String toString(){
         String cad = "";
         
         for (T e : pila){
             cad += " " + e.toString();
         }
         return cad;
    }

  

}
