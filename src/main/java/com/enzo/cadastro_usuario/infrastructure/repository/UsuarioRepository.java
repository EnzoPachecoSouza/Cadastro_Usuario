package com.enzo.cadastro_usuario.infrastructure.repository;

import com.enzo.cadastro_usuario.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
