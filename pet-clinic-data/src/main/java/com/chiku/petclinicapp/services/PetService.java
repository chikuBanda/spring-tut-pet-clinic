package com.chiku.petclinicapp.services;

import com.chiku.petclinicapp.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
