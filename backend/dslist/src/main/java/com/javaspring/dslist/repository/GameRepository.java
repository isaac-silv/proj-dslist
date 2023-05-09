package com.javaspring.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
