package com.kkphoenix.dsList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkphoenix.dsList.dto.GameMinDTO;
// import com.kkphoenix.dsList.dto.GameMinDTO;
import com.kkphoenix.dsList.entities.Game;
import com.kkphoenix.dsList.repositories.GameRepository;

@Service
public class GameService  {
  

  @Autowired
  private GameRepository gameRepository;

  public List<GameMinDTO> findAll(){
    List<Game> result = gameRepository.findAll();
    
    return result.stream().map(x -> new GameMinDTO(x) ).toList();
  }

}

