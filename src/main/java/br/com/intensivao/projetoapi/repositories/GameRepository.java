package br.com.intensivao.projetoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.intensivao.projetoapi.model.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
}
