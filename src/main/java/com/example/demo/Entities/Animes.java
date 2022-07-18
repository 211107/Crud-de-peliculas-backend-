package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name = "animes")
public class Animes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id_anime;

    @Column(name = "nombre_anime")
    private String nombre_anime;

    @Column(name = "genero_anime")
    private  String genero_anime;

    @Column(name = "clasificacion_anime")
    private  String clasificacion_anime;

    public Animes(){

    }

    public int getId_anime() {
        return id_anime;
    }

    public void setId_anime(int id_anime) {
        this.id_anime = id_anime;
    }

    public String getNombre_anime() {
        return nombre_anime;
    }

    public void setNombre_anime(String nombre_anime) {
        this.nombre_anime = nombre_anime;
    }

    public String getGenero_anime() {
        return genero_anime;
    }

    public void setGenero_anime(String genero_anime) {
        this.genero_anime = genero_anime;
    }

    public String getClasificacion_anime() {
        return clasificacion_anime;
    }

    public void setClasificacion_anime(String clasificacion_anime) {
        this.clasificacion_anime = clasificacion_anime;
    }

    public Animes(int id_anime, String nombre_anime, String genero_anime, String clacificacion_anime){
        this.id_anime = id_anime;
        this.nombre_anime= nombre_anime;
        this.genero_anime = genero_anime;
        this.clasificacion_anime= clacificacion_anime;
    }



}
