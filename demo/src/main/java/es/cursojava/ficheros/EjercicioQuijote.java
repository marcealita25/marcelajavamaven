package es.cursojava.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;

public class EjercicioQuijote {

    public static void main(String[] args) {
        
        String directorio ="D:\\ficheros\\Quijote.txt";

        int contadorLineas = 0;
        //se utiliza para ubicacion en archivo.
        try (BufferedReader bf = new BufferedReader(new FileReader(directorio))) {

            String linea ;

            while((linea =bf.readLine()) != null){
                //System.out.println(linea);esta linea sirve para leer el archivo
                contadorLineas++;

            }

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            
        } 
        System.out.println(contadorLineas);
    }

}
