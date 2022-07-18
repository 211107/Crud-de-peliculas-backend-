package com.example.demo.Controller;

import com.example.demo.Entities.Programas;
import com.example.demo.Service.ProgramasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Programasaaaa")
public class ProgramasController {

    @Autowired
    private ProgramasServices Services;


    @GetMapping("listar")
    public List<Programas> listarrrrrr(){
        return Services.Listadooooo();
    }

    @PostMapping("/add")//Agregar
    public Programas addProgramas(@RequestBody @Validated Programas programas){
        return Services.agregar(programas);
    }
    @PutMapping("/mod")
    public Programas modi(@RequestBody @Validated Programas programas){
        return Services.modi(programas);
    }
    @DeleteMapping("/Eliminar/{id}")
    public void eliminar(@PathVariable("id") int id){
        Services.eliminar(id);
    }





}
