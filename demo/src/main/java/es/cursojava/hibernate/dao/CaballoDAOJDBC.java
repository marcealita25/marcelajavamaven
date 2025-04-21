package es.cursojava.Hibernate.dao;

import java.util.List;

import es.cursojava.hibernate.entities.CaballoCarrera;

public class CaballoDAOJDBC implements CaballoDAO{

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


}
