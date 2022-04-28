package ru.test.cafe.cafedemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Класс сорт кофе
 */
@Entity
@Data
public class CoffeeGrade {
    /**
     * id
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * Наименование сорт кофе на русском
     */
    private String gradeNameRu;
    /**
     * Наименование сорт кофе на английском
     */
    private String gradeNameEng;
    /**
     * Цена сорта кофе
     */
    private Integer price;
    /**
     * Наличие сорта кофе
     */
    private boolean disabled;
}

