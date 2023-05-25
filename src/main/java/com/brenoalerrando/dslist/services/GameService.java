package com.brenoalerrando.dslist.services;

import com.brenoalerrando.dslist.dto.GamerMinDTO;
import com.brenoalerrando.dslist.entities.Game;
import com.brenoalerrando.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired //puxando uma instância
    private GameRepository gameRepository;
    public List<GamerMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GamerMinDTO> dto = result.stream().map(x -> new GamerMinDTO(x)).toList();
        return dto;
    }
}
