package br.senai.service;


import br.senai.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UsuarioService {

    //pesquisar todos
    public List <Usuario> findAll();

    //pesquisar pelo usuario a partir do id
    public Optional <Usuario> findById(long id);

    //novo usuario
    public Usuario create (Usuario usuario);


    //editar usuario
    public  Usuario update (Usuario usuario, long id);



    // deletar usuario
    public void delete (long id);


}
