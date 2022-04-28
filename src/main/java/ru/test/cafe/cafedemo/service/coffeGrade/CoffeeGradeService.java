package ru.test.cafe.cafedemo.service.coffeGrade;

import ru.test.cafe.cafedemo.model.CoffeeGrade;

import java.util.List;

/**
 * Сервис по работе с объектом Тип кофе.
 */
public interface CoffeeGradeService {
    /**
     * Возвращает все элементы справочника Тип кофе
     * @return
     */
    List<CoffeeGrade> getAllCoffeeGrades();
}
