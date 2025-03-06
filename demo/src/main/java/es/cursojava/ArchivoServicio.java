package es.cursojava;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivoServicio {

    public void crearArchivo2(String nombre){
        File archivo = new File (nombre);


        try (PrintWriter buffer = new PrintWriter(archivo)){
            //try (PrintWriter buffer = new PrintWriter(new fileWriter(archivo))){
                buffer.println("Hola que tal amigos!");
                buffer.println("Todo bien ? yo escribo un archivo...") ;
                buffer.printf("Hasta luego %s! %s", "JoseLuis5","Cadena");
                    
                System.out.println("El archivo se ha creado con éxito!");

            
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
