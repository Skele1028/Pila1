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
public class Persona extends Base{
    
    private String nombre;
    private String telefono;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Telefono: " + telefono + ", EDad: " + edad ;
    }

    @Override
    public Base copy() {
        return new Persona(nombre, telefono, edad);
    }
    
 
}
