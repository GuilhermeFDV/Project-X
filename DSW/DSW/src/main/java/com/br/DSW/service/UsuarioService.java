package com.br.DSW.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.lang.model.util.Elements.Origin;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.DSW.domain.Usuario;

import repository.UsuarioRepository;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    public List<Usuario> listall(){
        return usuarioRepository.findAll(); 
    }
    public Usuario findByIdOrThrowBadRequestException(long id){

        return usuarioRepository.findByIdOrThrowBadRequestException(id).orElseThrow(()->new ResponseStatusException(HttpStatus.BAD_REQUEST,"Usuário not found"));

    }
    public Usuario save(UsuarioPostRequestBody UsuarioPostRequestBody){
        Usuario usuario=Usuario.builder().name(UsuarioPostRequestBody.getName()).build();
        return usuarioRepository.save(usuario);
    }
    public void delete(Long id) {
        usuarioRepository.delete(findByIdOrThrowBadRequestException(id));
    }
    public void replace(UsuarioPutRequestBody UsuarioPutRequestBody) {
        Usuario saveduUsuario=findByIdOrThrowBadRequestException(UsuarioPutRequestBody.getId());
        Usuario usuario = Usuario.builder()
            .id(saveduUsuario.getId())
            .name(UsuarioPutRequestBody.getName())
            .build();
        usuarioRepository.save(usuario);
    }
}
