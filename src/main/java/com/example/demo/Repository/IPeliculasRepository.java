package com.example.demo.Repository;

import com.example.demo.Entities.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPeliculasRepository  extends CrudRepository<Peliculas , Integer> {


    List<Peliculas> findAll();//Listar

    Peliculas save(Peliculas peliculas);//Agregar

    Peliculas findById(int id_pelicula);
    @Override
    void delete(Peliculas peliculas);//eliminar

}
