package es.cursojava.Hibernate.dao;

import java.util.List;

import es.cursojava.Hibernate.EjercicioCaballo.CaballoCarrera;
import es.cursojava.Hibernate.dto.CaballoDTO;



public interface CaballoDAO {
    void insertar(CaballoCarrera caballo);
    List<es.cursojava.Hibernate.entities.CaballoCarrera> obtenerTodos();
    List<es.cursojava.Hibernate.entities.CaballoCarrera> obtenerActivos();
    void eliminar(Long id);
    void actualizar(es.cursojava.Hibernate.entities.CaballoCarrera cc);
    void insertar(es.cursojava.Hibernate.entities.CaballoCarrera caballo);
    es.cursojava.Hibernate.entities.CaballoCarrera getCaballoPorId(Long idCaballo);

    public es.cursojava.Hibernate.entities.CaballoCarrera getCaballoPorId(Long idCaballo);

    public es.cursojava.Hibernate.entities.CaballoCarrera getCaballoPorId(Long idCaballo);
    List<es.cursojava.Hibernate.entities.CaballoCarrera> obtenerCaballosPorNacionalidadJinete(String nacionalidad);

    public List<es.cursojava.Hibernate.entities.CaballoCarrera> obtenerCaballosPorNacionalidadJinete(String nacionalidad);

    public CaballoDTO obtenerJinete(long idCaballo);
}