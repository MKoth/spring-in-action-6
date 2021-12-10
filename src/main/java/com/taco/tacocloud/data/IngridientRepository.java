package com.taco.tacocloud.data;

import com.taco.tacocloud.Ingridient;

public interface IngridientRepository {

    Iterable<Ingridient> findAll();

    Ingridient findOne(String id);

    Ingridient save(Ingridient ingredient);
    
}
