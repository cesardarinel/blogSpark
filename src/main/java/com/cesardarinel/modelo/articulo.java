package com.cesardarinel.modelo;

import java.util.Date;
import java.util.List;

/**
 * Created by cesar on 01/06/16.
 */
public class articulo {


    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public usuario getAutor() {
        return autor;
    }

    public void setAutor(usuario autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public articulo(int id, String titulo, String cuerpo, usuario autor, Date fecha, List<etiqueta> etiquetas, List<comentario> comentarios) {

        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.autor = autor;
        this.fecha = fecha;
        this.etiquetas = etiquetas;
        this.comentarios = comentarios;
    }

    private String titulo;
    private String cuerpo;
    private usuario autor;
    private Date fecha;
    private List<etiqueta> etiquetas;
    private List<comentario> comentarios;

}
