package com.taco.tacocloud.data;

import com.taco.tacocloud.Ingridient;

import org.springframework.data.repository.CrudRepository;

public interface IngridientRepository extends CrudRepository<Ingridient, String> {
    
}
