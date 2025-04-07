/* Crear una entidad llamada CaballoCarrera que represente la información de un caballo de carreras. 

La clase debe llamarse CaballoCarrera y debe mapearse a una tabla llamada TB_CABALLOS.

Debe tener los siguientes atributos con sus respectivas restricciones:

id		Long	Clave primaria. Valor generado automáticamente.
nombre		String	Obligatorio, único, longitud máxima de 50 caracteres.
edad		int	Obligatorio. Valor mínimo: 2. Valor máximo: 30.
velocidadMaxima	double	Obligatorio. Entre 30.0 y 80.0 km/h.
numeroDeTriunfosint	Valor mínimo: 0.
experiencia	double	Valor entre 0.0 y 10.0.
estaActivo	boolean	Puede ser verdadero o falso. Indica si el caballo está actualmente compitiendo.

Crear 5 caballos e insertarlos en la tabla 


Ejericio 2.
====================================================
Crear Menú:

1. Registrar Caballo, pedir datos de un caballo e insertarlos en la base de datos
2. Iniciar Carrera, 
	(Consulta a BBDD)
	+ Si no hay dos caballos activos no se puede iniciar
	+ Si hay dos caballos o más activos se inicia la carrera
	
	+ 1000 distancia a la que tiene que llegar un caballo para ganar la carrera
	+ Por cada caballo activo avanzara = (Aleatorio 1-50) + experiencia * (1-10) - edad*(1-10) = ???
	
	+ Mostrar datos del caballo ganador
3. Salir*/


package es.cursojava.Hibernate.EjercicioCaballo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;



@Entity
@Table(name = "TB_CABALLOS")

public class CaballoCarrera {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(name = "nombre", nullable = false, unique=true, length=50 )
private String nombre;

@Column(name = "edad", nullable = false )
@Min(value = 2, message = "La edad mínima debe ser 2 años.")
@Max(value = 30, message = "La edad máxima debe ser 30 años.")
private int edad;


@Column(name = "VelocidadMaxima", nullable = false )
@Min(value = 30)
@Max(value = 80)
private double velocidadMaxima;

@Column(name = "NumeroTriunfo" , nullable = false)
@Min(value = 0)
private int numeroTriunfo;

@Column(name = "Experiencia", nullable = false)
@Min(value =0)
@Max(value = 10)
private double experiencia;

@Column(name = "EstadoActivo", nullable = false)

private boolean estadoActivo;



public CaballoCarrera() {
}




public CaballoCarrera(String nombre, int edad, double velocidadMaxima, int numeroTriunfo, double experiencia,
        boolean estadoActivo) {
    this.nombre = nombre;
    this.edad = edad;
    this.velocidadMaxima = velocidadMaxima;
    this.numeroTriunfo = numeroTriunfo;
    this.experiencia = experiencia;
    this.estadoActivo = estadoActivo;
}





public CaballoCarrera(String nombre,
        @Min(value = 2, message = "La edad mínima debe ser 2 años.") @Max(value = 30, message = "La edad máxima debe ser 30 años.") int edad,
        @Min(30) @Max(80) double velocidadMaxima) {
    this.nombre = nombre;
    this.edad = edad;
    this.velocidadMaxima = velocidadMaxima;
}




public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
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

public double getVelocidadMaxima() {
    return velocidadMaxima;
}

public void setVelocidadMaxima(double velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
}

public int getNumeroTriunfo() {
    return numeroTriunfo;
}

public void setNumeroTriunfo(int numeroTriunfo) {
    this.numeroTriunfo = numeroTriunfo;
}

public double getExperiencia() {
    return experiencia;
}

public void setExperiencia(double experiencia) {
    this.experiencia = experiencia;
}

public boolean isEstadoActivo() {
    return estadoActivo;
}

public void setEstadoActivo(boolean estadoActivo) {
    this.estadoActivo = estadoActivo;
}




}

