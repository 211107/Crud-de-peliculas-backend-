package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name = "peliculas")
public class Peliculas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id_pelicula;

    @Column(name = "nombre_pelicula")
    private String nombre_pelicula;

    @Column(name = "genero_pelicula")
    private  String genero_pelicula;

    @Column(name = "clasificacion_pelicula")
    private  String clasificacion_pelicula;

    public Peliculas(){

    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getNombre_pelicula() {
        return nombre_pelicula;
    }

    public void setNombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public String getGenero_pelicula() {
        return genero_pelicula;
    }

    public void setGenero_pelicula(String genero_pelicula) {
        this.genero_pelicula = genero_pelicula;
    }

    public String getClasificacion_pelicula() {
        return clasificacion_pelicula;
    }

    public void setClasificacion_pelicula(String clasificacion_pelicula) {
        this.clasificacion_pelicula = clasificacion_pelicula;
    }

    public Peliculas(int id_pelicula, String nombre_pelicula, String genero_pelicula, String clacificacion_pelicula){
        this.id_pelicula = id_pelicula;
        this.nombre_pelicula= nombre_pelicula;
        this.genero_pelicula = genero_pelicula;
        this.clasificacion_pelicula = clacificacion_pelicula;
    }



}
