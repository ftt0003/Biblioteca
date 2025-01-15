package es.medac.alu.ftt0003.classes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String dni;
    private int edad;
    private List<Libro> librosEnPrestamo;
    private int infracciones;

    public Usuario(){
        super();
    }

    public Usuario(String dni,int edad){
        if(ValidadorDatos.validadorDNI(dni) && edad > 0){
            this.dni = dni;
            this.edad = edad;
            this.librosEnPrestamo = new ArrayList<>();
            this.infracciones = 0;
        }

    }

    public int getEdad() {
        return edad;
    }

    public int getInfracciones() {
        return infracciones;
    }

    public List<Libro> getLibrosEnPrestamo() {
        return librosEnPrestamo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setInfracciones(int infracciones) {
        this.infracciones = infracciones;
    }
    public boolean addLibro(Libro lib){
        return librosEnPrestamo.add(lib);
    }

    //TODO
    public boolean retornarLibro(){
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", edad=" + edad +
                ", librosEnPrestamo=" + librosEnPrestamo +
                ", infracciones=" + infracciones +
                '}';
    }
}
