package ru.test.cafe.cafedemo.model;

import liquibase.pro.packaged.S;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Класс Заказ
 */
@Entity
public class Order {
    /**
     * id
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * Дата и время заказа
     */
    private Date orderDateTime;
    /**
     * Имя заказчика
     */
    private String customerName;
    /**
     * Адрес доставки
     */
    private String deliveryAddress;
    /**
     * Тип доставки
     */
    private String deliveryType;
    /**
     * Полная стоимость заказа
     */
    private Integer fullOrderPrice;
    /**
     * Статус заказа
     */
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(Date orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Integer getFullOrderPrice() {
        return fullOrderPrice;
    }

    public void setFullOrderPrice(Integer fullOrderPrice) {
        this.fullOrderPrice = fullOrderPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
