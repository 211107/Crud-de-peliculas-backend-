package com.example.demo.Repository;

import com.example.demo.Entities.Programas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProgramasRepository  extends CrudRepository<Programas, Integer> {


    List<Programas> findAll();//Listar

    Programas save(Programas programas);//Agregar

    Programas findById(int id_programas);
    @Override
    void delete(Programas programas);//eliminar

}
