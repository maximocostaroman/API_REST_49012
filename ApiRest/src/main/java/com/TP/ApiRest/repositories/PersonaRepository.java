package com.TP.ApiRest.repositories;

import com.TP.ApiRest.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long > {
}
