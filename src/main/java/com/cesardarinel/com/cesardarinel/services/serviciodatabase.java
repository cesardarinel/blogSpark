package com.cesardarinel.com.cesardarinel.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by cesar on 01/06/16.
 */
public class serviciodatabase {

    private static serviciodatabase instancia;
    private String URL = "jdbc:h2:tcp://localhost/~/pruebaTep";

    /**
     *Implementando el patron Singlenton
     */
    private  serviciodatabase(){
        registrarDriver();
    }

    /**
     * Retornando la instancia.
     * @return
     */
    public static serviciodatabase getInstancia(){
        if(instancia==null){
            instancia = new serviciodatabase();
        }
        return instancia;
    }

    /**
     * Metodo para el registro de driver de conexión.
     */
    private void registrarDriver() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger("", String.valueOf(ex));
        }
    }

    public Connection getConexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, "sa", "");
        } catch (SQLException ex) {
            Logger.getLogger("", String.valueOf(ex));
        }
        return con;
    }

    public void testConexion() {
        try {
            getConexion().close();
            System.out.println("Conexión realizado con exito...");
        } catch (SQLException ex) {
            Logger.getLogger("", String.valueOf(ex));
        }
    }

}
