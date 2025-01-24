package es.medac.alu.ftt0003.classes;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    @Test
    void ConstructorVacio(){
        Libro libro = new Libro();

        //Verificar que se genera una instancia del tipo correcto util en casos de polimorfismo
        assertInstanceOf(Libro.class, libro);

        assertNull(null,libro.getIsbn());
        assertEquals("Desconocido",libro.getAutor());
        assertEquals(Categoria.SIN_CATEGORIZAR,libro.getCategoria());

    }

}