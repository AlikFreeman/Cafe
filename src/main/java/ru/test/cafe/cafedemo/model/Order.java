package ru.test.cafe.cafedemo.model;

import liquibase.pro.packaged.S;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

/**
 * Класс Заказ
 */
@Entity
@Data
@NoArgsConstructor
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
    @OneToMany(mappedBy = "order")
    List<OrderPoint> points;
}

