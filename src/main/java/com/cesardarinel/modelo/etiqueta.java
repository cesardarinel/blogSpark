package com.cesardarinel.modelo;

/**
 * Created by cesar on 01/06/16.
 */
public class etiqueta {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public etiqueta(int id, String etiqueta) {
        this.id = id;
        this.etiqueta = etiqueta;
    }

    private int id;
    private String etiqueta;
}
