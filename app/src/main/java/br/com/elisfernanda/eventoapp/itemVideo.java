package br.com.elisfernanda.eventoapp;

import java.io.Serializable;

/**
 * Created by Elis Fernanda on 28/09/2016.
 */
public class itemVideo implements Serializable {
    private String titulo;
    private String data;
    private String url;

    public itemVideo(String titulo, String data, String url) {
        this.titulo = titulo;
        this.data = data;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
