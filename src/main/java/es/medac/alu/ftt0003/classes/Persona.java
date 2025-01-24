package es.medac.alu.ftt0003.classes;

public abstract class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(){
        super();
    }
    public Persona(String dni, String nombre,String apellido, String direccion){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

}
