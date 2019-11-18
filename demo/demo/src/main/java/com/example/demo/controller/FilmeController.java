package com.example.demo.controller;

import com.example.demo.model.Filme;
import com.example.demo.model.FilmeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmeController {
    private FilmeInterface filmeInterface;

    @Autowired
    public FilmeController(FilmeInterface filmeInterface) { this.filmeInterface = filmeInterface; }


    @PostMapping("/filme")
    public ResponseEntity<String> cadastrarFilme(@RequestBody Filme filme) {
        this.filmeInterface.save(filme);
        return ResponseEntity.ok("Filme salvo com sucesso");
    }

    @GetMapping("/filme/genero/{genero}")
    public ResponseEntity<List<Filme>> buscarFIlmePorGenero(@PathVariable("genero") String generoFilme) {
            List<Filme> filmesGenero= filmeInterface.findByGenero(generoFilme);
            if(filmesGenero.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(filmesGenero);

    }

    @GetMapping("/filme/nome/{nome}")
    public ResponseEntity<List<Filme>> buscarFilmePorNome(@PathVariable("nome") String nomeFilme ) {
        List<Filme> filmesNome= filmeInterface.findByGenero(nomeFilme);
        if(filmesNome.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(filmesNome);
    }

}
