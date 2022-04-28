package ru.test.cafe.cafedemo.service.coffeGrade;


import ru.test.cafe.cafedemo.model.CoffeeGrade;

import java.util.Collection;
import java.util.List;

public interface CrudCoffeeService
{

    CoffeeGrade addCoffeeGrade(CoffeeGrade coffeeGrade);

    CoffeeGrade updateCoffeeGrade(CoffeeGrade coffeeGrade);

    void deleteCoffeeGrade(List<CoffeeGrade> coffeeGrades);

    List<CoffeeGrade> updateListCoffeeGrade(Collection<CoffeeGrade> coffeeGrades);

}
