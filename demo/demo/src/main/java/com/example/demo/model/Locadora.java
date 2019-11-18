package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;


@Entity
public class Locadora {
     @Id
     @GeneratedValue
     private Long id;

     @JsonProperty
     public String local;

     @JsonProperty
     public String nome;

    @OneToMany(mappedBy = "filmesfk")
    private List<Filme> listaFilme;

    //@Embedded
//    @JsonProperty
//    private Filme filme;

    public Locadora() {
    }

    public Locadora(String local, String nome) {
        this.local = local;
        this.nome = nome;
        //this.filme = filme;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filme> getListaFilme() {
        return listaFilme;
    }

    //    public Filme getFilme() {
//        return filme;
//    }
}
