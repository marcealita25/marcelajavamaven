package es.cursojava.Hibernate.EjercicioCaballo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import es.cursojava.Hibernate.HibernateUtil;

public class ConsultaCaballo {

    
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSession();


        System.out.println(" Consultar Caballo ======================");

        //String nombre, int edad, double velocidadMaxima, int numeroTriunfo, double experiencia,
        //boolean estadoActivo

        String hql1 = "select p.nombre, p.edad, p.velocidadMaxima,p.numeroTriunfo, p.experiencia,p.estadoActivo from CaballoCarrera p where p.edad>:edadMin";
        Query<Object[]> query1 = session.createQuery(hql1, Object[].class);
        query1.setParameter("edadMin", 1);
        List<Object[]> resgistros1 = query1.list();
        List<CaballoCarrera>caballoDTO = new ArrayList<>();
        for (Object[] registro : resgistros1) {
            System.out.println("nombre: "+registro[0]);
            System.out.println("edad: "+registro[1]);
            System.out.println("velocidadMaxima: "+registro[2]);
            System.out.println("numeroTriunfo: "+registro[3]);
            System.out.println("experiencia: "+registro[4]);
            System.out.println("estadoActivo: "+registro[5]);

            String nombre = (String)registro[0];
            int edad = (int)registro[1];
            double velocidadMaxima = (double)registro[2];
            int numeroTriunfo = (int)registro[3];
            double experiencia = (double)registro[4];
            boolean estadoActivo = (boolean)registro[5];



             Long id;
             CaballoCarrera ccdto = new CaballoCarrera(id, nombre, edad, numeroTriunfo, experiencia, 1, estadoActivo);
            caballoDTO.add(ccdto);
            
            System.out.println("======================");
        }

    }

}
