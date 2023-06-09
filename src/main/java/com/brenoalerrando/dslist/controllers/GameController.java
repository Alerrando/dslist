package com.brenoalerrando.dslist.controllers;

import com.brenoalerrando.dslist.dto.GamerMinDTO;
import com.brenoalerrando.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class  GameController {

    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GamerMinDTO> findAll(){
        List<GamerMinDTO> result = gameService.findAll();

        return result;
    }
}
