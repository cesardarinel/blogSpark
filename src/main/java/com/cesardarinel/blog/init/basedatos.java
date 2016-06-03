package com.cesardarinel.blog.init;

import com.cesardarinel.com.cesardarinel.services.serviciodatabase;
import org.h2.tools.Server;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by cesar on 01/06/16.
 */
public class basedatos {
    /**
     *
     * @throws SQLException
     */
    public static void startDb() throws SQLException {
        Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start();
    }

    /**
     *
     * @throws SQLException
     */
    public static void stopDb() throws SQLException {
        Server.shutdownTcpServer("tcp://localhost:9092", "", true, true);
    }//por ahora no lo usare..... creo al cerrar la app se cierra , hacer pruebas


    /**
     * Metodo para recrear las tablas necesarios
     * @throws SQLException
     */
    public static void crearTablas() throws  SQLException{
        Connection con = serviciodatabase.getInstancia().getConexion();
        droptable();

        String sql = "CREATE TABLE IF NOT EXISTS usuario (\n" +
                "                        id INTEGER  auto_increment PRIMARY KEY NOT NULL,\n" +
                "                username VARCHAR(100) NOT NULL,\n" +
                "                nombre VARCHAR(100) NOT NULL,\n" +
                "        password VARCHAR(100) NOT NULL,\n" +
                "        administrador BOOLEAN NOT NULL,\n" +
                "        autor BOOLEAN NOT NULL\n" +
                "        );";
        Statement statement = con.createStatement();
        statement.execute(sql);
        statement.close();

         sql = "CREATE TABLE IF NOT EXISTS COMENTARIO " +
                 "( \n" +
                 "  id INTEGER  auto_increment PRIMARY KEY NOT NULL, \n" +
                 "  comentario VARCHAR(800) NOT NULL,\n" +
                 "  autor INTEGER NOT NULL,\n" +
                 "  articulo INTEGER NOT NULL\n" +
                 ");";
        statement = con.createStatement();
        statement.execute(sql);
        statement.close();
         sql = "CREATE TABLE IF NOT EXISTS ARTICULO ( \n" +
                 "  id INTEGER auto_increment  PRIMARY KEY NOT NULL, \n" +
                 "  titulo VARCHAR(200) NOT NULL,\n" +
                 "  cuerpo VARCHAR(10000) NOT NULL,\n" +
                 "  autor INTEGER NOT NULL,\n" +
                 "  fecha date NOT NULL,\n" +
                 "  etiquetas INTEGER NOT NULL,\n" +
                 "  comentarios INTEGER NOT NULL\n" +
                 ");";
        statement = con.createStatement();
        statement.execute(sql);
        statement.close();
        sql = "CREATE TABLE IF NOT EXISTS ETIQUETA " +
                "( \n" +
                "  id INTEGER  auto_increment PRIMARY KEY NOT NULL, \n" +
                "  etiqueta VARCHAR(800) NOT NULL\n" +
                ");";
        statement = con.createStatement();
        statement.execute(sql);
        statement.close();
//init base
        sql = "insert into usuario VALUES ('1','admin','admin','admin','1','0'); ";
        statement = con.createStatement();
        statement.execute(sql);
        statement.close();

            con.close();
    }
    public static void droptable() throws SQLException {
        Connection con = serviciodatabase.getInstancia().getConexion();
        String sql = "drop table  IF EXISTS usuario";
        Statement statement = con.createStatement();
        statement.execute(sql);
        statement.close();
         sql = "drop table IF EXISTS  comentario";
         statement = con.createStatement();
        statement.execute(sql);
        statement.close();
         sql = "drop table IF EXISTS  articulo";
         statement = con.createStatement();
        statement.execute(sql);
        statement.close();
        sql = "drop table IF EXISTS  etiqueta";
         statement = con.createStatement();
        statement.execute(sql);
        statement.close();
        con.close();

    }//
}
