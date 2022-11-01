package com.br.DSW.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.lang.model.util.Elements.Origin;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.DSW.domain.Usuario;

@Service
public class UsuarioService {
    private static List<Usuario> usuarios;
    static{
        usuarios = new ArrayList<>(List.of(new Usuario(1L,"Guilherme Falcão"),new Usuario(2L,"Marco Antonio"),new Usuario(3L,"Ricardo Ribas"),new Usuario(4L,"Vinicius Caires")));
    }
    public List<Usuario> listall(){
        return usuarios; 
    }
    public Usuario findById(long id){

        return usuarios.stream().filter(usuario -> usuario.getId().equals(id))
        .findFirst()
        .orElseThrow(()->new ResponseStatusException(HttpStatus.BAD_REQUEST,"Usuário not found"));
    }
    public Usuario save(Usuario usuario){
        usuario.setId(ThreadLocalRandom.current().nextLong(3,1000000000));
        usuarios.add(usuario);
        return usuario;
    }
    public void delete(Long id) {
        usuarios.remove(findById(id));
    }
    public void replace(Usuario usuario) {
        delete(usuario.getId());
        usuarios.add(usuario);
    }
}
