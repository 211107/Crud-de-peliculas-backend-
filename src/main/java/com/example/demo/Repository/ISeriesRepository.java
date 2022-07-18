package com.example.demo.Repository;

import com.example.demo.Entities.Programas;
import com.example.demo.Entities.Series;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ISeriesRepository extends CrudRepository<Series, Integer> {

    List<Series> findAll();//Listar

    Series save(Series series);//Agregar

    Series findById(int id_series);
    @Override
    void delete(Series series);//eliminar



}
