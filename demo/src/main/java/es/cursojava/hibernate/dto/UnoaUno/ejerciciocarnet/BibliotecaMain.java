package es.cursojava.Hibernate.dto.UnoaUno.ejerciciocarnet;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.Hibernate.HibernateUtil;
import es.cursojava.Hibernate.dto.UnoaUno.Direccion;
import es.cursojava.Hibernate.dto.UnoaUno.Usuario;
import es.cursojava.funciones.Utilidades;

public class BibliotecaMain {

     private static Session session = HibernateUtil.getSession();


    public static void main(String[] args) {
        // insertarUsuario();
        // consultarUsuarios();
        // consultarDirecciones();
        //Usuario u = consultarUsarioPorDireccionIDHQL(1);
       // System.out.println(u.getNombre());

        session.close();
    }
    
    private static void insertarUsuario() {

        String nombre = Utilidades.pideDatoCadena("Nombre del estudiante: ");
        Date fechaInicio =:
        Date fechaExpiracion  =

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
