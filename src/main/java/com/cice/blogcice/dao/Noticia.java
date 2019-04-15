package com.cice.blogcice.dao;

public class Noticia {
    private int idNoticia;
    private String titulo;
    private String noticia;

    public Noticia(int idNoticia, String titulo, String noticia) {
        this.idNoticia = idNoticia;
        this.titulo = titulo;
        this.noticia = noticia;
    }

    public Noticia() {
    }

    public int getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(int idNoticia) {
        this.idNoticia = idNoticia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    @Override
    public String toString() {
        return "com.cice.blogcice.dao.Noticia{" +
                "idNoticia=" + idNoticia +
                ", titulo='" + titulo + '\'' +
                ", noticia='" + noticia + '\'' +
                '}';
    }
}
