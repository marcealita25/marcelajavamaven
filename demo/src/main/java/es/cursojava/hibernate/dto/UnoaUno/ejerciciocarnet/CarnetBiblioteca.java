package es.cursojava.Hibernate.dto.UnoaUno.ejerciciocarnet;


import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_CARNETBIBLIOTECA")


public class CarnetBiblioteca {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private Date fechaEmision;
    private Date fechaExpiracion;

    @OneToOne(mappedBy = "carnetbiblioteca")
    private  Estudiante estudiante;

    public CarnetBiblioteca() {
    }

   

    

    public CarnetBiblioteca(Date fechaEmision, Date fechaExpiracion) {
        this.fechaEmision = fechaEmision;
        this.fechaExpiracion = fechaExpiracion;
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    
    
    
    
    


    


}
