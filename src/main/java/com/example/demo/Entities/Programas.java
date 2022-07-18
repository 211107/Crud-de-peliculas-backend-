package com.example.demo.Entities;

import javax.persistence.*;

@Entity
@Table(name = "programas")
public class Programas{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id_programa;

    @Column(name = "nombre_programa")
    private String nombre_programa;

    @Column(name = "genero_programa")
    private  String genero_programa;

    @Column(name = "clasificacion_programa")
    private  String clasificacion_programa;

    public Programas(){

    }

    public int getId_programa() {
        return id_programa;
    }

    public void setId_programa(int id_programa) {
        this.id_programa = id_programa;
    }

    public String getNombre_programa() {
        return nombre_programa;
    }

    public void setNombre_programa(String nombre_programa) {
        this.nombre_programa = nombre_programa;
    }

    public String getGenero_programa() {
        return genero_programa;
    }

    public void setGenero_programa(String genero_programa) {
        this.genero_programa = genero_programa;
    }

    public String getClasificacion_programa() {
        return clasificacion_programa;
    }

    public void setClasificacion_programa(String clasificacion_programa) {
        this.clasificacion_programa = clasificacion_programa;
    }

    public Programas(int id_programa, String nombre_programa, String genero_programa, String clacificacion_programa){
        this.id_programa = id_programa;
        this.nombre_programa= nombre_programa;
        this.genero_programa = genero_programa;
        this.clasificacion_programa = clacificacion_programa;
    }



}