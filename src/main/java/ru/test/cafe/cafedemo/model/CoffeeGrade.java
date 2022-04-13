package ru.test.cafe.cafedemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Класс Наименование сорт кофе
 */
@Entity
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
     * Наименование сорт кофе на русском
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeNameRu() {
        return gradeNameRu;
    }

    public void setGradeNameRu(String gradeNameRu) {
        this.gradeNameRu = gradeNameRu;
    }

    public String getGradeNameEng() {
        return gradeNameEng;
    }

    public void setGradeNameEng(String gradeNameEng) {
        this.gradeNameEng = gradeNameEng;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
}

