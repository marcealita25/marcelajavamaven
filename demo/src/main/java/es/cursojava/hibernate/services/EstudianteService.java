package es.cursojava.Hibernate.services;

import java.util.List;

import es.cursojava.Hibernate.dao.EstaudianteDAOImpl;
import es.cursojava.Hibernate.dao.EstudianteDAO;
import es.cursojava.Hibernate.dto.EstudianteDTO;
import es.cursojava.Hibernate.entities.CarnetBiblioteca;
import es.cursojava.Hibernate.entities.Estudiante;
import es.cursojava.Hibernate.exceptions.EstudianteException;
import es.cursojava.funciones.Utilidades;

public class EstudianteService {

    public void insertarEstudiante (EstudianteDTO estudianteDTO) throws EstudianteException{

        if (estudianteDTO.getEmail()==null 
            || estudianteDTO.getEmail().isBlank()
            || Utilidades.validarEmail(estudianteDTO.getEmail())){

            
            CarnetBiblioteca carnetBiblioteca = new CarnetBiblioteca(estudianteDTO.getFechaDeEmision(), estudianteDTO.getFechaDeExpiracion());
            Estudiante estudiante = new Estudiante(estudianteDTO.getNombre(), estudianteDTO.getEdad(),
                estudianteDTO.getEmail(), carnetBiblioteca);

            EstudianteDAO estudianteDAO = new EstaudianteDAOImpl();
            estudianteDAO.insertarEstudiante(estudiante);
            
        }else {
            throw new EstudianteException("El email es incorrecto");
        }


    }

    public List<Estudiante> getEstudiantes (){
        EstudianteDAO estudianteDAO = new EstaudianteDAOImpl();
        return estudianteDAO.getEstudiantes();
    }
}
