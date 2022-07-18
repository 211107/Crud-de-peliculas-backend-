package com.example.demo.Controller;

import com.example.demo.Entities.Peliculas;
import com.example.demo.Service.PeliculasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Peliculasaaaa")
public class PeliculaController {

    @Autowired
    private PeliculasServices Services;


    @GetMapping("listar")
    public List<Peliculas> listarrrrrr(){
        return Services.Listadooooo();
    }

    @PostMapping("/add")//Agregar
    public Peliculas add(@RequestBody @Validated Peliculas peliculas){
        return Services.agregar(peliculas);
    }
    @PutMapping("/mod")
    public Peliculas modi(@RequestBody @Validated Peliculas peliculas){
        return Services.modi(peliculas);
    }
    @DeleteMapping("/Eliminar/{id}")
    public void eliminar(@PathVariable("id") int id){
        Services.eliminar(id);
    }





}
