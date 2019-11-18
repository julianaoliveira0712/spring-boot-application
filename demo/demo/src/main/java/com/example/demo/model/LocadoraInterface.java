package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocadoraInterface extends JpaRepository<Locadora, Long> {

    @Query("select l from Locadora l where l.nome = :nome")
    public List<Locadora> findByNome(@Param("nome") String nome);
}
