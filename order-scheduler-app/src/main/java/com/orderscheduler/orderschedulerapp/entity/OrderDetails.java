/**
 *	This Entity adds requested order details in the specified database and table
 *
 */
package com.orderscheduler.orderschedulerapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="order_details") // MySQL Table name
@PersistenceContext // To manage the entities

public class OrderDetails {

    // Autogeneration of the ID
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String order_no;
    private java.sql.Date order_date;
    private Float order_total;
    private Integer status;
    private String is_order_complete;

    // Getter and Setter for each param
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return order_no;
    }

    public void setOrderNo(String order_no) {
        this.order_no = order_no;
    }

    public java.sql.Date getOrderDate() {
        return order_date;
    }

    public void setOrderDate(java.sql.Date order_date) {
        this.order_date = order_date;
    }

    public Float getOrderTotal() {
        return order_total;
    }

    public void setOrderTotal(Float order_total) {
        this.order_total = order_total;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIs_order_complete() {
        return is_order_complete;
    }

    public void setIs_order_complete(String is_order_complete) {
        this.is_order_complete = is_order_complete;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", orderNo=" + order_no  + ", orderDate=" + order_date + ", orderTotal=" + order_total + ", status=" + status + ", isOrderComplete=" + is_order_complete + "]";
    }
}
