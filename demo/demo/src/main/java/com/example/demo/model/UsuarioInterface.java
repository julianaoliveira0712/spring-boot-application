package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsuarioInterface extends JpaRepository<Usuario, Long> {

    public List<Usuario> findByNomeAndIdade(String nome, Integer idade);
    public List<Usuario> findByNome(String nome);
    public List<Usuario> findByIdade( Integer idade);


}
