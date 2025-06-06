package com.enzo.cadastro_usuario.business.service;

import com.enzo.cadastro_usuario.infrastructure.entity.Usuario;
import com.enzo.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void saveUsuario(Usuario usuario){
        usuarioRepository.saveAndFlush(usuario);
    }

    public Usuario searchUsuario(Long id){
        return usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário não encontrado com ID " + id)
        );
    }

    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }

    public void updateById(Long id, Usuario usuario){
        Usuario usuarioEntity = searchUsuario(id);

        Usuario usuarioUpdate = Usuario.builder()
                .id(usuarioEntity.getId())
                .email(usuario.getEmail() != null ? usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntity.getNome())
                .build();

        usuarioRepository.saveAndFlush(usuarioUpdate);
    }
}
