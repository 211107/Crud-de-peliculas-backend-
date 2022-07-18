package com.example.demo.Service;

import com.example.demo.Entities.Peliculas;
import com.example.demo.Repository.IPeliculasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculasServices {
    @Autowired//Inyeccion
    private IPeliculasRepository iPeliculasRepository;

    public List<Peliculas> Listadooooo(){//listado
        System.out.println("Listado");
        return iPeliculasRepository.findAll();
    };
    public Peliculas agregar(Peliculas peliculas){//Agregar
         return iPeliculasRepository.save(peliculas);
    };
    public  Peliculas modi(Peliculas peliculas){//modificar
        Peliculas aaaa = iPeliculasRepository.findById(peliculas.getId_pelicula());
        aaaa.setNombre_pelicula(peliculas.getNombre_pelicula());
        aaaa.setGenero_pelicula(peliculas.getGenero_pelicula());
        aaaa.setClasificacion_pelicula(peliculas.getClasificacion_pelicula());
        return iPeliculasRepository.save(aaaa);
    }
    public void eliminar(int id){
        Peliculas peliculas1 = iPeliculasRepository.findById(id);
        iPeliculasRepository.delete(peliculas1);
    }




}
