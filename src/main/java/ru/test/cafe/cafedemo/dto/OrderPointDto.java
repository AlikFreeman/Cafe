package ru.test.cafe.cafedemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
/**
 * Позиция заказа
 */
public class OrderPointDto {
    /**
     * id
     */
    private Integer coffeeGradeId;
    /**
     * Количество кружек
     */
    private Integer cupCounter;

    public Integer getCoffeeGradeId() {
        return coffeeGradeId;
    }

    public void setCoffeeGradeId(Integer coffeeGradeId) {
        this.coffeeGradeId = coffeeGradeId;
    }

    public Integer getCupCounter() {
        return cupCounter;
    }

    public void setCupCounter(Integer cupCounter) {
        this.cupCounter = cupCounter;
    }

}
