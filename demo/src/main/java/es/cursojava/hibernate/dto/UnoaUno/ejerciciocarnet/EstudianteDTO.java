package es.cursojava.Hibernate.dto.UnoaUno.ejerciciocarnet;

import java.util.Date;

public class EstudianteDTO {
    private String nombre;
    private int edad ;
    private String email;
    private  Date fechaEmisionCarnet;
    private Date fechaExpiracionCarnet;



    public EstudianteDTO(String nombre, int edad, String email, Date fechaEmisionCarnet, Date fechaExpiracionCarnet) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.fechaEmisionCarnet = fechaEmisionCarnet;
        this.fechaExpiracionCarnet = fechaExpiracionCarnet;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public Date getFechaEmisionCarnet() {
        return fechaEmisionCarnet;
    }



    public void setFechaEmisionCarnet(Date fechaEmisionCarnet) {
        this.fechaEmisionCarnet = fechaEmisionCarnet;
    }



    public Date getFechaExpiracionCarnet() {
        return fechaExpiracionCarnet;
    }



    public void setFechaExpiracionCarnet(Date fechaExpiracionCarnet) {
        this.fechaExpiracionCarnet = fechaExpiracionCarnet;
    }

     
   

    
}


