package com.taco.tacocloud.data;

import com.taco.tacocloud.Order;

public interface OrderRepository {

    Order save(Order order);
    
}
