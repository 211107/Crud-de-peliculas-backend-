package com.example.demo.Service;

import com.example.demo.Entities.Peliculas;
import com.example.demo.Entities.Series;
import com.example.demo.Repository.IPeliculasRepository;
import com.example.demo.Repository.ISeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesServices {

    @Autowired//Inyeccion
    private ISeriesRepository iSeriesRepository;

    public List<Series> Listadooooo(){//listado
        System.out.println("Listado");
        return iSeriesRepository.findAll();
    };
    public Series agregar(Series series){//Agregar

        return iSeriesRepository.save(series);
    };
    public  Series modi(Series series){//modificar
        Series aaaa = iSeriesRepository.findById(series.getId_serie());
        aaaa.setNombre_serie(series.getNombre_serie());
        aaaa.setGenero_serie(series.getGenero_serie());
        aaaa.setClasificacion_serie(series.getClasificacion_serie());
        return iSeriesRepository.save(aaaa);
    }
    public void eliminar(int id){
        Series series1 = iSeriesRepository.findById(id);
        iSeriesRepository.delete(series1);
    }


}
