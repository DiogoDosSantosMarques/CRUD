package br.senai.controller;


import br.senai.model.Goat;
import br.senai.service.GoatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GoatController {


    @Autowired
    GoatServiceImpl goatService;


    @GetMapping ("/goat")
    public List<Goat> findAll() {
        return goatService.findAll();
    }


    @GetMapping ("/goat/{id}")
    public Optional <Goat> findById (@PathVariable long id){
        return goatService.findById(id);
    }


    @PostMapping ("/goat")

    public Goat create (@RequestBody Goat goat) {
        return goatService.create(goat);
    }


    @PutMapping ("/goat/{id}")
    public Goat update(@RequestBody Goat goat, @PathVariable Long id) {
        return goatService.update(goat, id);
    }

    @DeleteMapping("/goat/{id}")
    public void delete(@PathVariable long id) {
        goatService.delete(id);
    }






}
