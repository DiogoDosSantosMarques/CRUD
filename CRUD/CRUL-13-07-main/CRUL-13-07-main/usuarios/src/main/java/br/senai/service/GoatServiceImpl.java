package br.senai.service;

import br.senai.model.Goat;
import br.senai.model.Usuario;
import br.senai.repository.GoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoatServiceImpl implements GoatService {

    @Autowired
    GoatRepository goatRepository;

    @Override
    public List<Goat> findAll() {
        return goatRepository.findAll();
    }

    @Override
    public Optional<Goat> findById(long id) {
        return goatRepository.findById(id);
    }

    @Override
    public Goat create(Goat goat) {
        return goatRepository.save(goat);
    }

    @Override
    public Goat update(Goat goat, long id) {
        Optional<Goat> g = goatRepository.findById(id);  //Pegando id do Goat
        if (!g.isEmpty()) {  //se não estiver vazio

            Goat goatUpdate = g.get();    // Então pega o id do usuário

            goatUpdate.setNomeJogador(goat.getNomeJogador());
            goatUpdate.setPosicaoHistoria(goat.getPosicaoHistoria());
            goatUpdate.setTimeAuge(goat.getTimeAuge());
            return goatRepository.save(goatUpdate);

        } else {
            return null;
        }

    }

    @Override
    public void delete(long id) {

        goatRepository.deleteById(id);

    }


}
