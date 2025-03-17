package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class ConexionBaseDatos {
	
    public static void main(String[] args) {
        
        conectaOracle();
    }

    private static void conectaOracle() {
		String url_oracle = "jdbc:oracle:thin:marcela/password@localhost:1522:XE";
		String url_oracle2 = "jdbc:oracle:thin:@localhost:1522:XE";
		String username = "marcela";
		String password = "password";

		
		try  {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(url_oracle2,username,password);
			if (connection!=null) {
				System.out.println("Conexion establecida");
			}

		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
			e.printStackTrace();
		//catch (ClassNotFoundException e) {
//ODO Auto-generated catch block
		//.printStackTrace();
		//

	}
	
	
	//tatic void conectaOracle2(){
	//tring url_oracle = "jdbc:oracle:thin:curso/password@localhost:1521:XE";
	//  String url_oracle2 = "jdbc:oracle:thin:@localhost:1521:XE";
	//String username = "curso";
	//String password = "password";

	//onecction connection = null;


 	try {
			OracleDataSource ods = new OracleDataSource();
			ods.setURL(url_oracle);
			
	 		Connection connection = ods.getConnection();
			if (connection!=null) {
				System.out.println("Conexion establecida");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	 	}

	}
}
