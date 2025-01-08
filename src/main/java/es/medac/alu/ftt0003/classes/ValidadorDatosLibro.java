package es.medac.alu.ftt0003.classes;

import java.util.Arrays;
import java.util.List;



public class ValidadorDatosLibro {
    private static final List<Character> VALORES_VALIDOS= Arrays.asList('1','2','3','4','5','6','7','8','9');
    //TODO
    public static boolean ValidarDatosLibro(Libro lib){
        return false;
    }
    /** TODO
     *   1.La validacion de ISBN  recive un Libro
     *   2.En caso de que este sea null o el isbn sea null -> throw  IlleagalArgumentExpection()
     *   3.Verificar la longitud del ISBN -> Si el ISBN es distinto de 10 o 13  este sera incorrecto.
     *   4.Si cumple lo anterior, recorremos la cadena caracter a caractet y evaluamos si esta en la
     *     lista de valores aceptados.(EVITAR CARACTERES DISTINTO DE NUMEROS 1-9).
     *   5.Validar que cada uno de los elementos sea correcto con el formato ISBN.(Esta operacion se puede realizar
     *     simultaneamente  con el punto 4).
     * **/
    public static boolean ValidarIsbn(String isbn){
        if(isbn == null) throw new IllegalArgumentException();

        if(isbn.length() != 10 && isbn.length() != 13) return false;

        for(int i = 0; i < isbn.length(); i++){
            if(!VALORES_VALIDOS.contains((isbn.charAt(i)))) return false;
        }

        /**
        * TODO FALTARIAN LOS DOS SIGUIENTES CASOS DE TRATAMIENTO PARA ISBN
        * Caso de ISBN1O -- Que los valores cumplan con los datos para que cada uno de los 10 digitos cumpla
        * Caso de ISBN13 -- Que los valores cumplan con los datos para cada uno de los 13 digitos
        */
        return true;
    }
}
