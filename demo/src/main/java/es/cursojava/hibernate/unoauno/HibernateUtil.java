package es.cursojava.Hibernate.unoauno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    //private static final Session session;
    private static Session session;

    // static{
    //     try {
    //         SessionFactory sessionFactory = new Configuration()
    //                 .configure() // Carga hibernate.cfg.xml
    //                 .buildSessionFactory();
    //         session = sessionFactory.openSession();
    //     } catch (Throwable ex) {
    //         System.err.println("Error al crear la SessionFactory." + ex);
    //         throw new ExceptionInInitializerError(ex);
    //     }
    // }

    private static Session generateSession (){ 
        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();
            session = sessionFactory.openSession();
        } catch (Throwable ex) {
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        return session;
    }

    public static Session getSession() {
        if (session == null) {
            session = generateSession();
        }
       
        return session;
    }
}
