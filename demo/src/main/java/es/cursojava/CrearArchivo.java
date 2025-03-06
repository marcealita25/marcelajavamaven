package es.cursojava;

import java.time.Instant;
import java.time.LocalDateTime;



public class CrearArchivo {

    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime); //fecha y hora
        System.out.println(datetime.getYear());//el año
        System.out.println(datetime.getMonthValue());//el mes 
        //System.out.println(datetime.getMonth()); 

        Instant instant = Instant.now();
        System.out.println(instant);
        //ruta relativa a la carpeta del proyecto
        String nombreArchivo = "./recursos/java3.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);
    }

}
