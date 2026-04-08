public class Libro {

    private String titulo;
    private String autor;
    private String categoria;
    private int anio;
    private int cantidadEjemplares;

    public Libro(){
        titulo ="Java para ingeniros";
        autor="Paulo Guerra";
        categoria="Programacion";
        anio=2014;
        cantidadEjemplares=5;

    }

    public Libro(int cantidadEjemplares,
                 String autor,String categoria, String titulo, int anio){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.anio=anio;
        this.cantidadEjemplares=cantidadEjemplares;

    }

    public String mostrarInformacion(){
        String aux="";
        aux="Titulo: "+titulo+"\n";
        aux+="Autor: "+autor+"\n";
        aux+="Categoria: "+categoria+"\n";
        aux+="Año: "+anio+"\n";
        aux+="Cantidad: "+cantidadEjemplares+" ejemplares(es) \n";
        return aux;

    }

    public int prestar(){
        if(cantidadEjemplares>0){
            cantidadEjemplares--;
            return cantidadEjemplares;
        }
        return -1;  // Significa que no no hay ejemlares


    }
    public int devolver(){
        cantidadEjemplares++;
        return cantidadEjemplares;

    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }
    public void setCantidadEjemplares(int cantidadEjemplares){
        this.cantidadEjemplares=cantidadEjemplares;
    }


}