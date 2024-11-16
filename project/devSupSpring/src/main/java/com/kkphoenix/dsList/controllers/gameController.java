package com.kkphoenix.dsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkphoenix.dsList.dto.GameMinDTO;
import com.kkphoenix.dsList.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class gameController {
  
  @Autowired
  private GameService gameService;
  
  @GetMapping
  public List<GameMinDTO> findAll(){
    List<GameMinDTO> result = gameService.findAll();

    return result;
  }
}
