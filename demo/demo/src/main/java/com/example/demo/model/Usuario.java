package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    private  String nome;
    private Integer idade;

    public Usuario() {
    }

    public Usuario(Long id, String name, Integer idade) {
        this.id = id;
        this.nome = name;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
