package com.enzo.cadastro_usuario.controller;

import com.enzo.cadastro_usuario.business.service.UsuarioService;
import com.enzo.cadastro_usuario.infrastructure.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro-usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> saveUsuario(@RequestBody Usuario usuario){
        usuarioService.saveUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> searchById(@RequestParam Long id){
        return ResponseEntity.ok(usuarioService.searchUsuario(id));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUsuarioById(@RequestParam Long id){
        usuarioService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateUsuario(@RequestParam Long id, @RequestBody Usuario usuario){
        usuarioService.updateById(id, usuario);
        return ResponseEntity.ok().build();
    }
}
