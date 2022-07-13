package br.senai.service;


import br.senai.model.Goat;
import br.senai.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface GoatService {

    //Pesquisar todos os Goats escolhidos
    public List <Goat> findAll();

    //pesquisar pelo goat a partir do id
    public Optional<Goat> findById(long id);

    //novo jogador
    public Goat create (Goat goat);


    //editar goat
    public Goat update (Goat goat, long id);



    // deletar goat
    public void delete (long id);
}
