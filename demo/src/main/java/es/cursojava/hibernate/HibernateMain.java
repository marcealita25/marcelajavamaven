package es.cursojava.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
    
 public static void main(String[] args) {

        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            System.out.println(session);
            
            Persona p1 = new Persona("Maria", 28, "Perez");
            Persona p2 = new Persona("Carla", 34 , "Torres");
            Persona p3 = new Persona("Mario", 56 , "Aliaga");
    
    
            session.persist(p1);
            session.persist(p2);
            session.persist(p3);
    
            tx.commit();

        } catch (Throwable ex) {
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        
        

        
        
        
    }

}
