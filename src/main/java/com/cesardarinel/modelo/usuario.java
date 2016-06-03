package com.cesardarinel.modelo;

/**
 * Created by cesar on 01/06/16.
 */
public class usuario {


    public usuario(int id, String username, String nombre, String password, Boolean administrador, Boolean autor) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.password = password;
        this.administrador = administrador;
        this.autor = autor;
    }

    private int id;
    private String  username;
    private String  nombre;
    private String  password;
    private Boolean administrador;
    private Boolean autor;

    public usuario() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public Boolean getAutor() {
        return autor;
    }

    public void setAutor(Boolean autor) {
        this.autor = autor;
    }



}
