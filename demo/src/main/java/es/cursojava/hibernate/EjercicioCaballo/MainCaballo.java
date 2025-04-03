package es.cursojava.Hibernate.EjercicioCaballo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import es.cursojava.funciones.Utilidades;

public class MainCaballo {

    
    public static void main(String[] args) {

        String nombreCaballo ="";
        int edadCaballo = 0;
        double velocidadCaballo = 0;
        int triunfoCaballo = 0;
        double experienciaCaballo = 0;
        boolean estadoCaballo = true;




        nombreCaballo = Utilidades.pideDatoCadena("Ingrese nombre del caballo ");
        edadCaballo = Utilidades.pideDatoNumerico("Ingrese la edad del caballo");
       velocidadCaballo = Utilidades.pideDatoDecimal("Ingreses la velocidad del caballo");
       triunfoCaballo = Utilidades.pideDatoNumerico("Ingresa los Triunfos del caballo");
       experienciaCaballo = Utilidades.pideDatoDecimal("Ingrese la experiencia del caballo");
       estadoCaballo = Utilidades.pideDatoboolean("Ingrese el estado del caballo (si/no)");


        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            System.out.println(session);
            
            CaballoCarrera caballo1 = new CaballoCarrera(nombreCaballo, edadCaballo,velocidadCaballo, triunfoCaballo,experienciaCaballo, estadoCaballo);
            // CaballoCarrera caballo2 = new CaballoCarrera("Carlit", 4, 30, 2, 7, true);
            // CaballoCarrera caballo3 = new CaballoCarrera("Mariano", 5, 40, 3,5 , true);
            // CaballoCarrera caballo4 = new CaballoCarrera("Peperino", 7, 70, 6, 8, true);
            // CaballoCarrera caballo5 = new CaballoCarrera("Copilot", 9, 50, 4,9 , true);
            
            
    
            session.persist(caballo1);
            // session.persist(caballo2);
            // session.persist(caballo3);
            // session.persist(caballo4);
            // session.persist(caballo5);
            
    
            tx.commit();

        } catch (Throwable ex) {
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        
        

        
        
        
    }
     
}


