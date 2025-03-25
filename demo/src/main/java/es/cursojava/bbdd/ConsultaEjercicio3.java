package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.utils.UtilidadesBD;

public class ConsultaEjercicio3 {
    private static final String CONSULTA_EMPLEADOS=""+
                    "SELECT em.ID as ID_EMPLEADO,  em.EDAD as EDAD_EMPLEADO, em.NOMBRE AS NOM_EMPLEADO, em.Salario AS SALARIO_EM "+
                    " AS DEPARTAMENTO_IDEM,em.ID_EQUIPO AS ID_EQUIPOEM,e.ID AS ,e.NOMBRE AS NOMBRE_EQUIPO"+
                    " FROM EQUIPOS e "+
                    " join empleados em on em.id_equipo = e.id";
    public static void main(String[] args) {

        
    }
    
    public static List<Empleado> consultaEmpleadoMap() {
        List<Empleado> empleados = new ArrayList<>();
        Map<String, String> mapaEmpleados = new HashMap<>();

        Connection conexion = UtilidadesBD.crearConnection();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conexion.createStatement();
            String query = CONSULTA_EMPLEADOS;

           

            System.out.println(query);

            rs = st.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("ID_EMPLEADO");
                String nombreEquipo = rs.getString("NOMBRE_EQUIPO");
                String nombreEmpleado= rs.getString("NOMBRE_EMPLEADO");
                int edad = rs.getInt("EDAD_EMPLEADO");
                double salario = rs.getDouble("SALARIO_EMPLEADO");

                Empleado emp = new Empleado(id, nombreEmpleado, edad, salario, id, null);
                empleados.add(emp); 

              // mapaEmpleados.putIfAbsent(nombreEquipo, new ArrayList<>());
                //mapaEmpleados.get(nombreEquipo).add(emp);
                
                
            }   
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            UtilidadesBD.cierraConexion(conexion);
            try {
                st.close();
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


        return empleados;
    }
    //public static Map<>String ,
}


