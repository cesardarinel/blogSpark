package com.cesardarinel.modelo;

/**
 * Created by cesar on 01/06/16.
 */
public class comentario {


    public comentario(int id, String comentario, usuario autor, com.cesardarinel.modelo.articulo articulo) {
        this.id = id;
        this.comentario = comentario;
        this.autor = autor;
        this.articulo = articulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public usuario getAutor() {
        return autor;
    }

    public void setAutor(usuario autor) {
        this.autor = autor;
    }

    public com.cesardarinel.modelo.articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(com.cesardarinel.modelo.articulo articulo) {
        this.articulo = articulo;
    }

    private int id;
    private String comentario;
    private usuario autor;
    private articulo articulo;
}
