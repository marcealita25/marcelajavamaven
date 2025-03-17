package es.cursojava.ficheros;
import java.util.Date;

public class Evento {
    private int id;
    private String nombre;
    private Date fecha;
    private String lugar;
    private String descripcion;
    private  int duracion ;
    private double precio;
    private String organizador;
    private boolean gratuito;

    public Evento(String descripcion, int duracion, Date fecha, boolean gratuito, int id, String lugar, String nombre, String organizador, double precio) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.fecha = fecha;
        this.gratuito = gratuito;
        this.id = id;
        this.lugar = lugar;
        this.nombre = nombre;
        this.organizador = organizador;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", fecha=").append(fecha);
        sb.append(", lugar=").append(lugar);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", duracion=").append(duracion);
        sb.append(", precio=").append(precio);
        sb.append(", organizador=").append(organizador);
        sb.append(", gratuito=").append(gratuito);
        sb.append('}');
        return sb.toString();
    }

    

    
    
    

    

}
