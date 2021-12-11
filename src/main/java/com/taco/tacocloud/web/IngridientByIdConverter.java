package com.taco.tacocloud.web;

import com.taco.tacocloud.Ingridient;
import com.taco.tacocloud.data.IngridientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngridientByIdConverter implements Converter<String, Ingridient> {

  private IngridientRepository ingredientRepo;

  @Autowired
  public IngridientByIdConverter(IngridientRepository ingredientRepo) {
    this.ingredientRepo = ingredientRepo;
  }

  @Override
  public Ingridient convert(String id) {
    return ingredientRepo.findById(id).orElseThrow();
  }

}
