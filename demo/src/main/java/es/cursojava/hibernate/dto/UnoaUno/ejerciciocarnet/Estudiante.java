package es.cursojava.Hibernate.dto.UnoaUno.ejerciciocarnet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name="TB_ESTUDIANTE")
public class Estudiante {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
     private String nombre;
     private int edad;
     private String Email;

     @OneToOne(cascade= CascadeType.ALL,fetch =FetchType.EAGER)
     @joinColumna(name = "
     FK_Carnet")

    private  Estudiante estudiante;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        Email = email;
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
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    
}
