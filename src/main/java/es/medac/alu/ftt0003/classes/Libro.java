package es.medac.alu.ftt0003.classes;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private String editorial;
    private int edicion;
    private int paginas;
    private int numCopias;
    private Categoria categoria;

    public Libro(){
        super();
        this.autor = "Desconocido";
        this.categoria = Categoria.SIN_CATEGORIZAR;
    }

    public Libro(String titulo,String isbn, String autor, String editorial,
                 int edicion, int paginas, Categoria categoria){
        //Validar datos de entrada
        if(ValidadorDatos.ValidarIsbn(isbn)){
            if(categoria == null) categoria = Categoria.SIN_CATEGORIZAR;
            this.titulo =titulo;
            this.isbn = isbn;
            this.autor = autor;
            this.editorial = editorial;
            this.edicion = edicion;
            this.paginas = paginas;
            this.categoria = categoria;

        }else{
            this.autor = "Desconocido";
            this.categoria = Categoria.SIN_CATEGORIZAR;
        }

    }

    public Libro(Libro libro){
        this.titulo =libro.titulo;
        this.isbn = libro.isbn;
        this.autor = libro.autor;
        this.editorial = libro.editorial;
        this.edicion = libro.edicion;
        this.paginas = libro.paginas;
        this.categoria = libro.categoria;
    }

    public int getEdicion() {
        return edicion;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean equals(Libro l){
        if(!(l.getClass().equals(Libro.class))) return false;
        if(!l.getIsbn().equals(this.isbn)) return  false;
        if(!l.getTitulo().equals(this.titulo)) return false;

        return true;
    }
    //TODO Metodo toString

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", edicion=" + edicion +
                ", paginas=" + paginas +
                ", categoria=" + categoria +
                '}';
    }
}
