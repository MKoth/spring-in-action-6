package com.taco.tacocloud.data;

import com.taco.tacocloud.Order;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
    
}
