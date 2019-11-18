package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.model.UsuarioInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    //	private List<Usuario> usuarios;
    private UsuarioInterface usuarioInterface;

    @Autowired
    public UsuarioController(UsuarioInterface usuarioInterface) {
        this.usuarioInterface = usuarioInterface;
    }

    @GetMapping("/usuarios/nome/{nomeDoUsuario}")
    public ResponseEntity<List<Usuario>> obterPorNome(
            @PathVariable("nomeDoUsuario") String nome) {
        List<Usuario> usuarios = usuarioInterface.findByNome(nome);
//		List<Usuario> usuariosPorNome = new ArrayList<>();
//		for(Usuario u : usuarios) {
//			if(u.getNome().equals(nome)) {
//				usuariosPorNome.add(u);
//			}
//		}
        if (usuarios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("usuarios/idade/{idadeDoUsuario}")
    public ResponseEntity<List<Usuario>> obterPorIdade(
            @PathVariable("idadeDoUsuario") Integer idade) {
        List<Usuario> usuariosPorIdade = usuarioInterface.findByIdade(idade);
        if (usuariosPorIdade.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(usuariosPorIdade);
    }

//	private List<Usuario> obterTodosUsuarios() {
//		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//		usuarios.add(new Usuario("Rodrigo", 39));
//		usuarios.add(new Usuario("Rodrigo", 30));
//		usuarios.add(new Usuario("Michelle", 18));
//
//		return usuarios;
//	}

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario) {
        usuarioInterface.save(usuario);
        return ResponseEntity.ok(usuario);
    }
}

