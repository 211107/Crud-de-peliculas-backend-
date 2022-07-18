package com.example.demo.Controller;

import com.example.demo.Entities.Programas;
import com.example.demo.Entities.Series;
import com.example.demo.Service.PeliculasServices;
import com.example.demo.Service.SeriesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Seriess")

public class SeriesController {

    @Autowired
    private SeriesServices Services;

    @GetMapping("listar")
    public List<Series> listarrrrrr(){
        return Services.Listadooooo();
    }

    @PostMapping("/add")//Agregar
    public Series addSeries(@RequestBody @Validated Series series){ return Services.agregar(series);
    }
    @PutMapping("/mod")
    public Series modi(@RequestBody @Validated Series series){
        return Services.modi(series);
    }
    @DeleteMapping("/Eliminar/{id}")
    public void eliminar(@PathVariable("id") int id){
        Services.eliminar(id);
    }

}
