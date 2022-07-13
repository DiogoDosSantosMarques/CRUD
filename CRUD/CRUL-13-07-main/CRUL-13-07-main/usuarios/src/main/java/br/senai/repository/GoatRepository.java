package br.senai.repository;

import br.senai.model.Goat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GoatRepository extends JpaRepository<Goat, Long> {


}
