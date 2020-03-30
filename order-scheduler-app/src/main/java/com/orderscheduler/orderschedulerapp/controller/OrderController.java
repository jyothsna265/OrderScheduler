/**
 *	Rest controller class which calls -
 *	1. Update the existing OrderDetails based on the Order status and Order Date.
 *	2. Add New order by passing Order#, Order Date, Order Amt, Order Status and default Order complete (N)
 *
 */

package com.orderscheduler.orderschedulerapp.controller;

import com.orderscheduler.orderschedulerapp.service.UpdateOrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.orderscheduler.orderschedulerapp.entity.OrderDetails;

@RestController
public class OrderController {

     /**
     *	Updates order details by calling UpdateOrderDetails class
	 *
     */

    @Autowired
    private UpdateOrderDetails service;

    /**
     *	Contains method to add new order details.
     *
     *	@param order_no - Order number - String type.
     *	@param order_date - Order date - Java sql date type (yyyy-mm-dd).
     *	@param order_total - Order total amount - Float type.
     *	@param order_status - Order statuss - Char type (0-Created, 1-Inprogress, 2-Delivered, 3-Cancelled).
     *	@param is_order_complete - Order completion status - Char type (default 'N').
     *
     */

    @RequestMapping(value="/orderDetails/addOrders", method = RequestMethod.POST)
    public void addOrderDetails(@RequestParam String order_no
            , @RequestParam java.sql.Date order_date, @RequestParam Float order_total, @RequestParam Integer status ) {

        OrderDetails order = new OrderDetails();

        order.setOrderNo(order_no);
        order.setOrderDate(order_date);
        order.setOrderTotal(order_total);
        order.setStatus(status);
        order.setIs_order_complete("N");
        service.addOrderDetails(order); // Calls the OrderDetails class by passing args
    }
}
