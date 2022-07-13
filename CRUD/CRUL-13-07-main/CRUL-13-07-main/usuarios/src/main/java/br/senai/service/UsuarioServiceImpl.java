package br.senai.service;

import br.senai.model.Usuario;
import br.senai.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll() ;
    }

    @Override
    public Optional <Usuario> findById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario) ;
    }

    @Override
    public Usuario update(Usuario usuario, long id) {

        Optional<Usuario> u = usuarioRepository.findById(id);  //pegando o id do usuario
        if (!u.isEmpty()) {  // se não estiver vazio, ou seja estiver algo lá

            Usuario usuarioUpdate = u.get();  // então pega o id do Usuario
            usuarioUpdate.setNome(usuario.getNome());
            usuarioUpdate.setUsername(usuario.getUsername());
            usuarioUpdate.setSenha(usuario.getSenha());
            return usuarioRepository.save(usuarioUpdate);
        } else {

            return null;
        }
    }



    @Override
    public void delete(long id) {

        usuarioRepository.deleteById(id);
    }
}
