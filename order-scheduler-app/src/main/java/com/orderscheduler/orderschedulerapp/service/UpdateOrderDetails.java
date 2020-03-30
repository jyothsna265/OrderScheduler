/**
 *	Main Service with scheduled for every 5 mins.
 *	1. Runs app every 5 mins and update any orders.
 * 	2. Additionally adds any new Order details entered into database.
 *
 */

package com.orderscheduler.orderschedulerapp.service;

import com.orderscheduler.orderschedulerapp.repository.OrderRepository;
import com.orderscheduler.orderschedulerapp.entity.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class UpdateOrderDetails {

    @Autowired
    private OrderRepository orderRepository;

    //Scheduled to run the service for every 5 mins
    @Scheduled(cron = "0 0/5 * * * ?")
    public void updateOrders() {
        orderRepository.updateOrders();
    }

    // Function to add order details
    public void addOrderDetails(OrderDetails order) {
        System.out.println("ORDER DETAILS" + order);
        orderRepository.save(order);
    }
}
