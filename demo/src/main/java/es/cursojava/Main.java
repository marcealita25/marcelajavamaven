package es.cursojava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        System.out.println("Hello Mundo world!");
        
        logger.debug("prueba logger");
    } 
}