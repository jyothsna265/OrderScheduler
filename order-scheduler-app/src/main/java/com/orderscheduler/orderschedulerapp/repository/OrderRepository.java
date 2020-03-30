/**
 *	Reporsitory function to Update the orders using JPA Native Query Technique
 *
 */
package com.orderscheduler.orderschedulerapp.repository;

import com.orderscheduler.orderschedulerapp.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {
    @Modifying
    // Query to update the orders where order status is 2 or 3 and order date is less than 90 days to system date.
    @Query(value = "UPDATE order_details o SET o.is_order_complete = 'Y' WHERE o.is_order_complete = 'N' AND o.status IN (2,3) AND o.order_date <= CURDATE()-90" , nativeQuery = true)
    public void updateOrders();
}
