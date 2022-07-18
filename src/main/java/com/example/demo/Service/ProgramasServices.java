package com.example.demo.Service;

import com.example.demo.Entities.Programas;
import com.example.demo.Repository.IProgramasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramasServices {
    @Autowired//Inyeccion
    private IProgramasRepository iProgramasRepository;

    public List<Programas> Listadooooo(){//listado
        System.out.println("Listado");
        return iProgramasRepository.findAll();
    };

    public Programas agregar(Programas programas){//Agregar
        return iProgramasRepository.save(programas);
    };
    public  Programas modi(Programas programas){//modificar
        Programas aaaa = iProgramasRepository.findById(programas.getId_programa());
        aaaa.setNombre_programa(programas.getNombre_programa());
        aaaa.setGenero_programa(programas.getGenero_programa());
        aaaa.setClasificacion_programa(programas.getClasificacion_programa());
        return iProgramasRepository.save(aaaa);
    }
    public void eliminar(int id){
        Programas programas1 = iProgramasRepository.findById(id);
        iProgramasRepository.delete(programas1);
    }




}
