package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FilmeInterface extends JpaRepository<Filme,Long> {

    @Query("select f from Filme f where f.genero = :genero")
    public List<Filme> findByGenero(@Param("genero") String genero);
}
