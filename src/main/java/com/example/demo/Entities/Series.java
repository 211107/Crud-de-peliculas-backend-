package com.example.demo.Entities;

import javax.persistence.*;

//capa de persistencia
@Entity
@Table(name = "series")
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id_serie;

    @Column(name = "nombre_serie")
    private String nombre_serie;

    @Column(name = "genero_serie")
    private  String genero_serie;

    @Column(name = "clasificacion_serie")
    private  String clasificacion_serie;


    public Series(){

    }





    public int getId_serie() {
        return id_serie;
    }

    public void setId_serie(int id_serie) {
        this.id_serie = id_serie;
    }

    public String getNombre_serie() {
        return nombre_serie;
    }

    public void setNombre_serie(String nombre_serie) {
        this.nombre_serie = nombre_serie;
    }

    public String getGenero_serie() {
        return genero_serie;
    }

    public void setGenero_serie(String genero_serie) {
        this.genero_serie = genero_serie;
    }

    public String getClasificacion_serie() {
        return clasificacion_serie;
    }

    public void setClasificacion_serie(String clasificacion_serie) {
        this.clasificacion_serie = clasificacion_serie;
    }

    public Series(int id_serie, String nombre_serie, String genero_serie, String clacificacion_serie){
        this.id_serie = id_serie;
        this.nombre_serie= nombre_serie;
        this.genero_serie = genero_serie;
        this.clasificacion_serie = clacificacion_serie;
    }


}
