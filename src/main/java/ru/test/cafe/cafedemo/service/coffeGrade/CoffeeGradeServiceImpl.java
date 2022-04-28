package ru.test.cafe.cafedemo.service.coffeGrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.test.cafe.cafedemo.model.CoffeeGrade;
import ru.test.cafe.cafedemo.repository.CoffeeGradeRepository;

import java.util.Collection;
import java.util.List;


@Service
public class CoffeeGradeServiceImpl implements CoffeeGradeService, CrudCoffeeService {
    @Autowired
    private CoffeeGradeRepository coffeeGradeRepository;

    @Override
    public List<CoffeeGrade> getAllCoffeeGrades() {
        return coffeeGradeRepository.findAll();
    }

    @Override
    public void deleteCoffeeGrade(List<CoffeeGrade> coffeeGrades)
    {
        coffeeGradeRepository.deleteAll(coffeeGrades);
    }

    @Override
    public List<CoffeeGrade> updateListCoffeeGrade(Collection<CoffeeGrade> coffeeGrades) {
        return null;
    }

    @Override
    public CoffeeGrade addCoffeeGrade(CoffeeGrade coffeeGrade)
    {
        return coffeeGradeRepository.save(coffeeGrade);
    }

    @Override
    public CoffeeGrade updateCoffeeGrade(CoffeeGrade coffeeGrade) {
        return null;
    }

}
