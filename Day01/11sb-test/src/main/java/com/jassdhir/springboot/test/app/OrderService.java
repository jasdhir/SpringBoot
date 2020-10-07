package com.jassdhir.springboot.test.app;



import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public String placeOrders(List<Order> orders) {
        //just a dummy service
        return orders.size() + " orders placed";
    }
}
