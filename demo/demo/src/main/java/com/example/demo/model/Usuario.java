package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @JsonProperty
    private  String nome;

    @JsonProperty
    private Integer idade;



    public Usuario() {
    }

    public Usuario( String name, Integer idade) {
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
