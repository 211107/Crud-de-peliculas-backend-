package com.example.demo.Controller;

import com.example.demo.Entities.Animes;
import com.example.demo.Service.AnimesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Animesaaaa")
public class AnimeController {

    @Autowired
    private AnimesServices services;

    @GetMapping
    public String hola() {
        return "Hola mundo!"
    }

    @GetMapping("listar")
    public List<Animes> listarrrrrr(){
        return services.Listadooooo();
    }

    @PostMapping("/add")//Agregar
    public Animes add(@RequestBody @Validated Animes animes){
        return services.agregar(animes);
    }
    @PutMapping("/mod")
    public Animes modi(@RequestBody @Validated Animes animes){
        return services.modi(animes);
    }
    @DeleteMapping("/Eliminar/{id}")
    public void eliminar(@PathVariable("id") int id){
        services.eliminar(id);
    }





}
