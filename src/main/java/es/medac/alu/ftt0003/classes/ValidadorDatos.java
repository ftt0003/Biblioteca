package es.medac.alu.ftt0003.classes;

import java.util.Arrays;
import java.util.List;

public class ValidadorDatos{
    private static final List<String> LETRAS_VALIDAS = Arrays.asList("T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S",
            "Q","V","H","L","C","K","E");

    /** TODO
     *   1.La validacion de ISBN  recive un Libro
     *   2.En caso de que este sea null o el isbn sea null -> throw  IlleagalArgumentExpection()
     *   3.Verificar la longitud del ISBN -> Si el ISBN es distinto de 10 o 13  este sera incorrecto.
     *   4.Si cumple lo anterior, recorremos la cadena caracter a caractet y evaluamos si esta en la
     *     lista de valores aceptados.(EVITAR CARACTERES DISTINTO DE NUMEROS 1-9).
     * **/
    public static boolean ValidarIsbn(String isbn){
        //Validacion de no nulidad y longitud correcta.
        if(isbn == null) throw new IllegalArgumentException();
        if(isbn.length() != 10 && isbn.length() != 13) return false;

        //Creacion de un array para almacenar los elementos de la cadena como numeros.
        int[] elementos;
        if(isbn.length() == 10) elementos = new int[10];
        else elementos = new int[13];

        //Filtrado de valores validos. Numeros entre 0-9 con ambos dos incluidos.
        if(!asignarNumerosISBN(elementos,isbn)) return false;

        //Validar codigos ISBN10 o ISBN13 || ESTO SE REALIZA ASI YA QUE CONSIDERAMOS QUE SOLO POSEE UNO DE LOS TIPOS DE ISBN.
        if(elementos.length == 10){
            return esValidoISBN10(elementos);
        }
        else{
            return esValidoISBN13(elementos);
        }
    }

    /**
     * Recorrera la cadena inicial perteneciente al ISBN del un objeto libro.
     * Validad que los elementos sean numeros en caso contrario retornara false
     * evitando una excepcion.**/

    private static boolean asignarNumerosISBN(int[] arr,String cadena){
        for(int i = 0; i < cadena.length(); i++){
            if(Integer.parseInt(String.valueOf(cadena.charAt(i))) < 0) return false;
            arr[i] = Integer.parseInt(String.valueOf(cadena.charAt(i)));
        }
        return true;

    }

    private static boolean esValidoISBN10(int[] arr){
        int resultado = 0;
        int valor = 1;
        for(int i = arr.length-1; i >= 0; i--){
            resultado += arr[i]* valor;
            valor++;
        }

        if(resultado % 11 == 0) return  true;
        return false;
    }

    private static boolean esValidoISBN13(int[] arr){
        int resultado = 0;

        for(int i = 0; i < 12; i++){
            if(i%2 == 0){
                resultado += arr[i];
            }else{
                resultado += arr[i]*3;
            }
        }

        int resto = resultado%10;
        resultado = 10 - resto;

        if(resultado == 10) resultado = 0;

        if(resultado == arr[arr.length-1]) return true;
        return false;

    }
    //TODO No valida correctamente
    public static boolean validadorDNI(String dni){

        if(dni.length() != 9) return false;
        if(!LETRAS_VALIDAS.contains(dni.substring(8))) return false;
        if(comprobarLetraDni(Integer.parseInt(dni.substring(0,8)),dni.substring(8))) return true;

        return false;
    }

    private static  boolean comprobarLetraDni(int num, String letra){
        num = num%23;

        if(LETRAS_VALIDAS.get(num).equals(letra))return true;
        return false;
    }

}
