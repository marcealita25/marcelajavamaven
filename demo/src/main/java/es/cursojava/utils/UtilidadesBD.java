package es.cursojava.utils;
import java.sql.Connection;

public class UtilidadesBD{

    private static final String URL_DB_ORACLE = "jdbc:oracle:thin:@localhost:1522:XE";
    private static final String USER_DB_ORACLE = "marcela";
    private static final String PASSWORD_DB_ORACLE ="password";
    private static Connection  conn = null;

    public static Connection crearConnection(){

       // conn = crearConnection(URL_DB_ORACLE,USER_DB_ORACLE,PASSWORD_DB_ORACLE);

        return conn;
        
    }

    





}




        





  

