# Biblioteca

Se pretende generar un programa para gestionar los usuario y libros de un biblioteca. <br>

## Libro
### Atributos
El libro posee los siguientes atributos: <br>
> [!NOTE]
>  Todos los atributos deben ser privados
- String Titulo
- String ISBN 
- String Autor 
- String Editorial
- int Edición
- int Numero de paginas
- Categoria Categoria <br>       
### Metodos
Se requiere tambien implementar sus constructores y metodos para gestionar las instancias de la clase.  
Tambien se quiere que datos como el ISBN sean verificados para asegurar la integridad de los datos.
#### Constructores Clase Libro
```java
public Libro(){...}//Constructor vacio
public Libro(String titulo,String isbn,...){...}//Construcotr con parametros
```
## Usuario
### Atributos
El usuario posee los siguientes atributos: <br>
> [!NOTE]
>  Todos los atributos deben ser privados

- String DNI
- int edad
- int infracciones
- Libros[ ] Libros  En este almacenaremos los distintos libros que tiene actualmente en prestamo el usuario.
