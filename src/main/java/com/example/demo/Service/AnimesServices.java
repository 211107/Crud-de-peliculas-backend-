package com.example.demo.Service;

import com.example.demo.Entities.Animes;
import com.example.demo.Repository.IAnimesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimesServices {
    @Autowired//Inyeccion
    private IAnimesRepository iAnimesRepository;

    public List<Animes> Listadooooo(){//listado
        System.out.println("Listado");
        return iAnimesRepository.findAll();
    };
    public Animes agregar(Animes animes){//Agregar
        return iAnimesRepository.save(animes);
    };
    public  Animes modi(Animes animes){//modificar
        Animes aaaa = iAnimesRepository.findById(animes.getId_anime());
        aaaa.setNombre_anime(animes.getNombre_anime());
        aaaa.setGenero_anime(animes.getGenero_anime());
        aaaa.setClasificacion_anime(animes.getClasificacion_anime());
        return iAnimesRepository.save(aaaa);
    }
    public void eliminar(int id){
        Animes animes1 = iAnimesRepository.findById(id);
        iAnimesRepository.delete(animes1);
    }




}
