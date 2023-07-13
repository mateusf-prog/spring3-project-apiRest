package br.com.intensivao.projetoapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.intensivao.projetoapi.model.dto.GameMinDTO;
import br.com.intensivao.projetoapi.services.GameService;

@RestController
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping("/games")
    public List<GameMinDTO> findAll() {
        return service.findAll();
    }
}
