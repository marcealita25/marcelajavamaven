package es.cursojava.Hibernate.dao;

import java.util.List;

import es.cursojava.hibernate.dao.CaballoCarrera;
import es.cursojava.hibernate.dto.Entities.CaballoDTO;

public class CaballoDAOJDBCImpl implements CaballoDAO{

    @Override
    public void insertar(CaballoCarrera caballo) {
        
    }

    @Override
    public List<CaballoCarrera> obtenerTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTodos'");
    }

    @Override
    public List<CaballoCarrera> obtenerActivos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerActivos'");
    }

    @Override
    public void eliminar(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public void actualizar(CaballoCarrera caballo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public CaballoCarrera getCaballoPorId(long caballoId){
        throw new UnsupportedOperationException("Unimplemented method 'getCaballoPorId'");
    }

    @Override
    public CaballoDTO obtenerJinete(long caballoId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerJinete'");
    }

    @Override
    public void insertar(es.cursojava.Hibernate.EjercicioCaballo.CaballoCarrera caballo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public void actualizar(es.cursojava.Hibernate.EjercicioCaballo.CaballoCarrera caballo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public void insertar(es.cursojava.Hibernate.entities.CaballoCarrera caballo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public es.cursojava.Hibernate.entities.CaballoCarrera getCaballoPorId(Long idCaballo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCaballoPorId'");
    }

    @Override
    public List<es.cursojava.Hibernate.entities.CaballoCarrera> obtenerCaballosPorNacionalidadJinete(
            String nacionalidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerCaballosPorNacionalidadJinete'");
    }
}
