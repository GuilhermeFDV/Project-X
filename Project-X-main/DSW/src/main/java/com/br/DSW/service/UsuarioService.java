package com.br.DSW.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.DSW.domain.Usuario;

@Service
public class UsuarioService {
    private List<Usuario> usuarios =List.of(new Usuario(1L,"Guilherme Falcão"),new Usuario(2L,"Marco Antonio"),new Usuario(3L,"Ricardo Ribas"),new Usuario(4L,"Vinicius Caires"));

    public List<Usuario> listall(){
        return usuarios; 
    }
    public Usuario findById(long id){

        return usuarios.stream().filter(usuario -> usuario.getId().equals(id))
        .findFirst()
        .orElseThrow(()->new ResponseStatusException(HttpStatus.BAD_REQUEST,"Usuário not found"));


    }
}
