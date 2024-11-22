package com.consoli.cadastro_usuario.repositories;

import com.consoli.cadastro_usuario.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
