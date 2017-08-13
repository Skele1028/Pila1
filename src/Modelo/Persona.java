package Modelo;

/**
 *
 * @author HOGAR
 */
public class Persona {
    String nombre;
    String id;
    int edad;
    String telefono;
    
    public Persona(){
        
    }
    public Persona ( String nombre, String id, int edad, String telefono){
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.telefono = telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNombre(){
        return nombre;
    }
    public String getId(){
        return id;
    }
    public int getEdad(){
        return edad;
    }
    public String getTelefono(){
        return telefono;
    }
    public String toString(){
        return nombre + " Identidicacion: " + id + "Edad: " + edad + " Telefono: " + telefono ;
    }
}
