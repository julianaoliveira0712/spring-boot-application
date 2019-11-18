package com.example.demo.controller;
import com.example.demo.model.Locadora;
import com.example.demo.model.LocadoraInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LocadoraController {
    private LocadoraInterface locadoraInterface;

    @Autowired
    public LocadoraController(LocadoraInterface locadoraInterface) { this.locadoraInterface = locadoraInterface; }


    @PostMapping("/locadora")
    public ResponseEntity<String> cadastrarLocadora(@RequestBody Locadora locadora) {
        this.locadoraInterface.save(locadora);
        return ResponseEntity.ok("Locadora salva com sucesso");
    }

    @GetMapping("/locadora/nome/{nome}")
    public ResponseEntity<List<Locadora>> buscarLocadoraPorNome(@PathVariable("nome") String nomeLocadora) {
        List<Locadora> locadorasNome= locadoraInterface.findByNome(nomeLocadora);
        if(nomeLocadora.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
            return ResponseEntity.ok(locadorasNome);
    }

}
