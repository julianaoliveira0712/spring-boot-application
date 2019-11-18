package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
//@Embeddable
public class Filme {

    @GeneratedValue
    @Id
    private Long id;

    @JsonProperty
    public String nome;

    @JsonProperty
    public String data_lancamento;

    @JsonProperty
    public String descricao;

    @JsonProperty
    public String genero;

    @JsonProperty
    public Integer quantidade;

   @ManyToOne
   @JoinColumn(name = "locadorafk")
   private Locadora filmesfk;


    public Filme() {
    }

    public Filme(String nome, String data_lancamento, String descricao, String genero, Integer quantidade) {
        this.nome = nome;
        this.data_lancamento = data_lancamento;
        this.descricao = descricao;
        this.genero = genero;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(String data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Locadora getFilmesfk() {
        return filmesfk;
    }
}
