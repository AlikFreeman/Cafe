package ru.test.cafe.cafedemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
