package Modelo;

/**
 *
 * @author HOGAR
 */
public class Estudiante extends Persona{
    String codigo;
    String carrera;
    int semestre;
    
    public Estudiante(){
        }
    public Estudiante(String codigo, String carrera, int semestre, String nombre, String id, int edad, String telefono) {
        super(nombre, id, edad, telefono);
        this.codigo = codigo;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getCarrera() {
        return carrera;
    }
    public int getSemestre() {
        return semestre;
    }
    @Override
    public String toString() {
        return "Estudiante " + super.toString() + "\n" + "Codigo: " + codigo + " Carrera: " + carrera + " Semestre: " + semestre ;
    }
    
   
    
}
