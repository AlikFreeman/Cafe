package ru.test.cafe.cafedemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
/**
 * Видимые данные для создания заказа
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeGradeViewDto
{

    private Integer gradeId;

    private String gradeNameRu;

    private String gradeNameEng;

    private Integer cupNumber;

    private Integer price;

    private Boolean disabled;


//    @Override
//    public boolean equals(Object o)
//    {
//        if(this == o)
//        {
//            return true;
//        }
//        if(o == null || getClass() != o.getClass())
//        {
//            return false;
//        }
//        CoffeeGradeViewDto that = (CoffeeGradeViewDto) o;
//        return Objects.equals(gradeId, that.gradeId) && Objects.equals(gradeNameRu, that.gradeNameRu) && Objects.equals(gradeNameEng, that.gradeNameEng) && Objects.equals(price, that.price) && Objects.equals(disabled, that.disabled);
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return Objects.hash(gradeId, gradeNameRu, gradeNameEng, price, disabled);
//    }
}
