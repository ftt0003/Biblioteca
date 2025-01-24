package es.medac.alu.ftt0003;

import es.medac.alu.ftt0003.classes.Categoria;
import es.medac.alu.ftt0003.classes.Libro;
import es.medac.alu.ftt0003.classes.Usuario;


public class Main {
    public static void main(String[] args){
        Libro libro = new Libro("test","0571894879","aaa","MEDAC",1,8888, null);
        System.out.println(libro);

        Libro libro2 = new Libro("test","9781234567897","aaa","MEDAC",1,8888, null);
        System.out.println(libro2);

        Libro libro3 = new Libro("test","0571894878","aaa","MEDAC",1,8888, null);
        System.out.println(libro3);

        Libro libro4 = new Libro("test","9781234567899","aaa","MEDAC",1,8888, null);
        System.out.println(libro4);
        System.out.println();

        Usuario user = new Usuario("67844313V",25);
        user.getLibrosEnPrestamo().add(libro);
        System.out.println(user);

        user.addLibro(libro2);
        user.addInfraciones();
        System.out.println(user);

        user.addInfraciones();
        user.addInfraciones();
        user.addInfraciones();
        System.out.println(user);

        user.retornarLibro(libro);
        System.out.println(user);

        user.addLibro(libro);
        System.out.println(user);

        user.reducirInfracciones();
        System.out.println(user);

        user.addLibro(libro2);
        System.out.println(user);

        libro2.setCategoria(Categoria.FICCION);
        System.out.println(user);
    }
}