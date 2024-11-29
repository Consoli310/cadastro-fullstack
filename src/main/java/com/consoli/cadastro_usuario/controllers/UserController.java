package com.consoli.cadastro_usuario.controllers;

import com.consoli.cadastro_usuario.entities.User;
import com.consoli.cadastro_usuario.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> ResponseEntity.ok(user))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/clientes")
    public String addUser(@ModelAttribute User user, Model model) {
        userRepository.save(user);
        model.addAttribute("message", "Cadastro realizado com sucesso!");
        return "sucesspage";
    }

    @DeleteMapping("users/{id}")
    public void deleteById(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    @GetMapping("/")
    public String initCliente(Model model) {
        model.addAttribute("cliente", new User());
        return "firstPage";
    }
}