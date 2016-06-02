package com.cesardarinel.blog;

import com.cesardarinel.blog.init.basedatos;
import com.cesardarinel.com.cesardarinel.services.serviciodatabase;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.io.StringWriter;
import java.sql.SQLException;

import static spark.Spark.*;

/**
 * Created by cesar on 01/06/16.
 */
public class index {

    public static void main(String[] args) throws SQLException {
        //staticFiles.location("/public");
        staticFileLocation("/publico");
        final Configuration configuration = new Configuration(new Version(2, 3, 0));
        configuration.setClassForTemplateLoading(index.class, "/template");

        //Iniciando el servicio
        basedatos.startDb();

        //Prueba de Conexión.
        serviciodatabase.getInstancia().testConexion();

        basedatos.crearTablas();
        get("/admin", (req, res) -> {

            StringWriter writer = new StringWriter();

            try {
                Template formTemplate = configuration.getTemplate("admin.ftl");

                formTemplate.process(null, writer);
            } catch (Exception e) {
                halt(500);
            }

            return writer;
        });


        get("/", (request, response) -> {

            StringWriter writer = new StringWriter();

            try {
                Template formTemplate = configuration.getTemplate("index.ftl");

                formTemplate.process(null, writer);
            } catch (Exception e) {
                halt(500);
            }

            return writer;
        });

        // Services services = new Services()
    }

}
