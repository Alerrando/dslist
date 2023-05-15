package com.brenoalerrando.dslist.repositories;

import com.brenoalerrando.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
