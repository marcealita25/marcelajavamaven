package es.cursojava.Hibernate.dto.UnoaUno.ejerciciocarnet.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_JINETE")
public class Jinete {
@Id
private long id;
@Column(name ="nombre_jinete", length = 20);
private String nombre;
@Column(name = "nacionalidad" , length = 30);
private final String nacionalidad;



}
