package es.cursojava.Hibernate.dto.UnoaUno.ejerciciocarnet;

public interface EstudianteDAO {

    void insertarEstudiante(Estudiante estudiante);

    List<Estudiante>getEstudiante ();

    Estudiante getEstudiantes (Long id);

    

}
