
package models;
public class Libros {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponible;
    private String localizacion;
    private String asignatura;  

    public Libros(int codigo, String titutlo, String autor, boolean disponible, String localizacion, String asignatura) {
        this.codigo = codigo;
        this.titulo = titutlo;
        this.autor = autor;
        this.disponible = disponible;
        this.localizacion = localizacion;
        this.asignatura = asignatura;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getAsignatura() {
        return asignatura;
    }
    
    public void getDatos(){
        System.out.println(codigo+"\n"+titulo+"\n"+autor+"\n"+disponible+"\n"+localizacion+"\n"+asignatura);
    }
    
}
