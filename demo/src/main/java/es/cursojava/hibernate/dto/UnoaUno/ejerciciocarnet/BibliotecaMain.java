package es.cursojava.Hibernate.dto.UnoaUno.ejerciciocarnet;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ch.qos.logback.classic.pattern.Util;
import es.cursojava.Hibernate.HibernateUtil;
import es.cursojava.Hibernate.dto.UnoaUno.Direccion;
import es.cursojava.Hibernate.dto.UnoaUno.Usuario;
import es.cursojava.funciones.Utilidades;

public class BibliotecaMain {

     Session session = HibernateUtil.getSession();

     String nombre =Utilidades.pideDatoCadena("Nombre del estudiante");
     String email = Utilidades.pideDatoCadena();
     Int edad=Util.pideDatoNumerico(); 
     Date fechaEmisionCarnet.pide();
     Date fechaExpiracion.pide()



    public static void main(String[] args) {
         insertarUsuario();
         consultarUsuarios();
        // consultarDirecciones();
        //Usuario u = consultarUsarioPorDireccionIDHQL(1);
       System.out.println(u.getNombre());

        session.close();
    }
    
    private static void insertarUsuario() {

        private static void insertarUsuario() {
        
            String nombre = Utilidades.pideDatoCadena("Nombre del usuario: ");
            String calle = Utilidades.pideDatoCadena("Calel del usuario: ");
            String ciudad = Utilidades.pideDatoCadena("Ciudad del usuario: ");
    
            Direccion direccion = new Direccion(calle, ciudad);
            Usuario usuario = new Usuario(nombre, direccion);
    
           
            Transaction tx = session.beginTransaction();
            session.persist(usuario);
            tx.commit();
            System.out.println("Usuario insertado.");
            
        }
    

       
       

    private static void consultarUsuarios() {
        List<Usuario> usuarios = session.createQuery("from Usuario", Usuario.class)
                .getResultList();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNombre());
        }
    }




}
