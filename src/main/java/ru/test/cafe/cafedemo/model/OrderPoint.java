package ru.test.cafe.cafedemo.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Класс Позиция заказа
 */
@Entity
public class OrderPoint {
    /**
     * id
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * Сорт кофе
     */
    private String gradeName;
    /**
     * Число чашек
     */
    private Integer cupCounter;
    /**
     * Номер заказа
     */
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getCupCounter() {
        return cupCounter;
    }

    public void setCupCounter(Integer cupCounter) {
        this.cupCounter = cupCounter;
    }
}

