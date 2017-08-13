/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.Base;

/**
 *
 * @author Daniela.diaz_bej
 */
public class Valor extends Base{

    private String texto;

    public Valor() {
    }

    public Valor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
    
   
    @Override
    public Base copy() {
        return new Valor(texto);
    }
    
}
