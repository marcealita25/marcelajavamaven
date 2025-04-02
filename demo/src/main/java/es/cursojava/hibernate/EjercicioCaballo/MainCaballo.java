package es.cursojava.Hibernate.EjercicioCaballo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainCaballo {

    
    public static void main(String[] args) {

        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            System.out.println(session);
            
            CaballoCarrera caballo1 = new CaballoCarrera("Manolito", 3, 60, 1, 4, true);
            CaballoCarrera caballo2 = new CaballoCarrera("Carlit", 4, 30, 2, 7, true);
            CaballoCarrera caballo3 = new CaballoCarrera("Mariano", 5, 40, 3,5 , true);
            CaballoCarrera caballo4 = new CaballoCarrera("Peperino", 7, 70, 6, 8, true);
            CaballoCarrera caballo5 = new CaballoCarrera("Copilot", 9, 50, 4,9 , true);
            
            
    
            session.persist(caballo1);
            session.persist(caballo2);
            session.persist(caballo3);
            session.persist(caballo4);
            session.persist(caballo5);
            
    
            tx.commit();

        } catch (Throwable ex) {
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        
        

        
        
        
    }
}


