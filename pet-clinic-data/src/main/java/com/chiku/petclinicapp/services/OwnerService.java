package com.chiku.petclinicapp.services;

import com.chiku.petclinicapp.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
