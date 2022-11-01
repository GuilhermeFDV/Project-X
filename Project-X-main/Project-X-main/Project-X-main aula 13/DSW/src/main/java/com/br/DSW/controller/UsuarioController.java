package com.br.DSW.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.DSW.domain.Usuario;
import com.br.DSW.service.UsuarioService;
import com.br.DSW.util.DateUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("usuarios")
@Log4j2
@RequiredArgsConstructor

public class UsuarioController {
    private final DateUtil dateUtil;
    private final UsuarioService usuarioService;
    //localhost:8080/usuario/list
    @GetMapping
    public ResponseEntity<List<Usuario>> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(usuarioService.listall());
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(usuarioService.findById(id));
    }
}
