package com.taco.tacocloud.data;

import com.taco.tacocloud.Taco;

import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    
}
