package com.dalvik.elementosui.exampleCardView;

public class Pelicula {
    private int id;
    private String titulo;
    private String genero;
    private String imgUrl;

    public Pelicula(int id, String titulo, String genero, String imgUrl) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.imgUrl = imgUrl;
    }

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
