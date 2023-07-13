package br.com.intensivao.projetoapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intensivao.projetoapi.model.dto.GameMinDTO;
import br.com.intensivao.projetoapi.model.entities.Game;
import br.com.intensivao.projetoapi.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository action;

    public List<GameMinDTO> findAll() {
        List<Game> result = action.findAll();
        List<GameMinDTO> listFinal = new ArrayList<>();
        for (Game obj : result) {
            GameMinDTO GameMin = new GameMinDTO(obj);
            listFinal.add(GameMin);
        }
        return listFinal;
    }
}
