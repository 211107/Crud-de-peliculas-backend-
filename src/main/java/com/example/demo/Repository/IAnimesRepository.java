package com.example.demo.Repository;

import com.example.demo.Entities.Animes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAnimesRepository  extends CrudRepository<Animes , Integer> {


    List<Animes> findAll();//Listar

    Animes save(Animes animes);//Agregar

    Animes findById(int id_animes);
    @Override
    void delete(Animes animes);//eliminar

}

