package com.kkphoenix.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkphoenix.dsList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
