package com.ty.Hospital.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ty.Hospital.Dto.Encounter;

public interface EncounterRepository extends MongoRepository<Encounter, Integer>{

}
