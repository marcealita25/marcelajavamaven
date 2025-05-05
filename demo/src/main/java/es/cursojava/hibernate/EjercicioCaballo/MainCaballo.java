package es.cursojava.Hibernate.EjercicioCaballo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import es.cursojava.Hibernate.HibernateUtil;
import es.cursojava.funciones.Utilidades;

import java.util.random.*;

import jakarta.persistence.Id;

public class MainCaballo {

    
    public static void main(String[] args) {
       
        int opcion;

        //Utilidades.pintaMenu("n.1Registar Caballo; n.2Iniciar Carrera ; n.3 Salir");
         
        do {

            // Pintar el menú utilizando la función Utilidades.pintaMenu
            Utilidades.pintaMenu("1. Registrar Caballo; 2. Iniciar Carrera; 3. Salir");
            
            // Leer la opción seleccionada por el usuario
            
            opcion=Utilidades.pideDatoNumerico("Elija una opcion");
            

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado 'Registrar Caballo'.");
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
                        
                        CaballoCarrera caballo1 = new CaballoCarrera(Id, nombreCaballo, edadCaballo, triunfoCaballo,experienciaCaballo, 1, estadoCaballo);
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
                    
                    break;
                case 2:
                    System.out.println("Has seleccionado 'Iniciar Carrera'.");
                     Session session = HibernateUtil.getSession();


        System.out.println(" Consultar Caballo ======================");

        //String nombre, int edad, double velocidadMaxima, int numeroTriunfo, double experiencia,
        //boolean estadoActivo

        String hql1 = "select p.nombre, p.edad, p.velocidadMaxima,p.numeroTriunfo, p.experiencia,p.estadoActivo from CaballoCarrera p where p.estadoActivo=:estadoActivoTrue";
        Query<Object[]> query1 = session.createQuery(hql1, Object[].class);
        query1.setParameter("estadoActivoTrue", true);
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



             CaballoCarrera ccdto = new CaballoCarrera(Id, nombre, edad, numeroTriunfo, experiencia, 1, estadoActivo);
            caballoDTO.add(ccdto);
            
            System.out.println("======================");
        }

        

            // Verificar si hay al menos dos caballos activos
            List<CaballoCarrera> caballosActivos = em.createQuery("SELECT c FROM CaballoCarrera c WHERE c.estaActivo = true", CaballoCarrera.class)
                                                     .getResultList();
        
            if (caballosActivos.size() < 2) {
                // Si no hay suficientes caballos activos, mostrar mensaje
                System.out.println("No hay suficientes caballos activos para iniciar la carrera.");
                return;
            
        
            // Si hay dos o más caballos activos, se inicia la carrera
            
            //Random rand = new Random();
            int distancia = 1000; // Distancia a recorrer
            CaballoCarrera ganador = null;
        
            // Iniciar la carrera, cada caballo avanzará en función de su experiencia y edad
            for (CaballoCarrera caballo : caballosActivos) {
                double avance = (rand.nextInt(50) + 1) + caballo.getExperiencia() * (rand.nextInt(10) + 1) - caballo.getEdad() * (rand.nextInt(10) + 1);
                
                // Comprobar si el caballo ha llegado a la meta
                if (avance >= distancia) {
                    if (ganador == null || avance > (rand.nextInt(50) + 1)) {
                        ganador = caballo;
                    }
                }
            }
        
            // Mostrar el resultado de la carrera
            if (ganador != null) {
                System.out.println("El caballo ganador es: " + ganador.getNombre());
            } else {
                System.out.println("Ningún caballo llegó a la meta.");
            }
        }

    
                    // Lógica para iniciar una carrera
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

        } while (opcion != 3); // El bucle se repite hasta que el usuario elige salir

        
    }
}


        
        

        
        
        

